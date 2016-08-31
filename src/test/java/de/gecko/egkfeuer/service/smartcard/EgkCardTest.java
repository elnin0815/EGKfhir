package de.gecko.egkfeuer.service.smartcard;

import com.licel.jcardsim.smartcardio.CardSimulator;
import com.licel.jcardsim.smartcardio.CardTerminalSimulator;
import com.licel.jcardsim.utils.AIDUtil;
import javacard.framework.AID;
import org.junit.Test;

import javax.smartcardio.*;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("restriction")
public class EgkCardTest
{

	// @Test
	// public void unmarschall() {
	// UCPersoenlicheVersichertendatenXMLv053 pd = JAXB.unmarshal(new
	// StringReader("<?xml version=\"1.0\" encoding=\"ISO-8859-15\" standalone=\"yes\"?><UC_PersoenlicheVersichertendatenXML CDM_VERSION=\"5.1.0\" xmlns=\"http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1\"><Versicherter><Versicherten_ID>H719994900</Versicherten_ID><Person><Geburtsdatum>19901124</Geburtsdatum><Vorname>Niklas</Vorname><Nachname>Bunge</Nachname><Geschlecht>M</Geschlecht><StrassenAdresse><Postleitzahl>74072</Postleitzahl><Ort>Heilbronn</Ort><Land><Wohnsitzlaendercode>D</Wohnsitzlaendercode></Land><Strasse>Oststr.</Strasse><Hausnummer>100</Hausnummer></StrassenAdresse></Person></Versicherter></UC_PersoenlicheVersichertendatenXML>"),
	// UCPersoenlicheVersichertendatenXMLv053.class);
	//
	// UCPersoenlicheVersichertendatenXMLv053 pd2 = JAXB.unmarshal(new
	// StringReader("<?xml version=\"1.0\" encoding=\"ISO-8859-15\" standalone=\"yes\"?><UC_PersoenlicheVersichertendatenXML CDM_VERSION=\"5.1.0\" xmlns=\"http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1\"><Versicherter><Versicherten_ID>D110104619</Versicherten_ID><Person><Geburtsdatum>19800112</Geburtsdatum><Vorname>Ltu</Vorname><Nachname>Musterkarte-0461</Nachname><Geschlecht>M</Geschlecht><StrassenAdresse><Postleitzahl>24937</Postleitzahl><Ort>Flensburg</Ort><Land><Wohnsitzlaendercode>D</Wohnsitzlaendercode></Land><Strasse>M�hlenstr.</Strasse><Hausnummer>46</Hausnummer></StrassenAdresse></Person></Versicherter></UC_PersoenlicheVersichertendatenXML>"),
	// UCPersoenlicheVersichertendatenXMLv053.class);
	//
	// UCPersoenlicheVersichertendatenXMLv053 pd3 = JAXB.unmarshal(new
	// StringReader("<?xml version=\"1.0\" encoding=\"ISO-8859-15\" standalone=\"yes\"?><UC_PersoenlicheVersichertendatenXML CDM_VERSION=\"5.1.0\" xmlns=\"http://ws.gematik.de/fa/vsds/UC_PersoenlicheVersichertendatenXML/v5.1\"><Versicherter><Versicherten_ID>D110104619</Versicherten_ID><Person><Geburtsdatum>19800112</Geburtsdatum><Vorname>Ltu</Vorname><Nachname>Musterkarte-0461</Nachname><Geschlecht>M</Geschlecht><StrassenAdresse><Postleitzahl>24937</Postleitzahl><Ort>Flensburg</Ort><Land><Wohnsitzlaendercode>D</Wohnsitzlaendercode></Land><Strasse>Mühlenstr.</Strasse><Hausnummer>46</Hausnummer></StrassenAdresse></Person></Versicherter></UC_PersoenlicheVersichertendatenXML>"),
	// UCPersoenlicheVersichertendatenXMLv053.class);
	//
	// System.out.println();
	//
	// }
	
	@Test
	public void testsim() throws CardException
	{

		CardSimulator simulator = new CardSimulator();
		AID appletAID = AIDUtil.create("D2760000015445535442");
		simulator.installApplet(appletAID, EgkSimG1Plus.class);

		CardTerminal terminal = CardTerminalSimulator.terminal(simulator);
		Card connect = terminal.connect("T=1");
		CardChannel channel = connect.getBasicChannel();

		CommandAPDU selectCommand = new CommandAPDU(AIDUtil.select(appletAID));
		simulator.transmitCommand(selectCommand);

		byte[] SELECT_ROOT = new byte[] { 0x00, (byte) 0xa4, 0x04, 0x0c, 0x07, (byte) 0xd2, 0x76, 0x00, 0x01, 0x44,
				(byte) 0x80, 0x00 };
		byte[] READ_PD = new byte[] { 0x00, (byte) 0xb0, (byte) (0x80 + 0x01), 0x00, 0x00, 0x00, 0x00 };

		byte[] READ_ATR = new byte[] { 0x00, (byte) 0xb0, (byte) (0x80 + 0x1d), 0x00, 0x00 };

		ResponseAPDU selectRootResponse = simulator.transmitCommand(new CommandAPDU(SELECT_ROOT));
		assertEquals(0x9000, selectRootResponse.getSW());
		ResponseAPDU atrResponse = channel.transmit(new CommandAPDU(READ_ATR));
		assertEquals(0x9000, atrResponse.getSW());
		ResponseAPDU readPdResponse = channel.transmit(new CommandAPDU(READ_PD));
		assertEquals(0x9000, readPdResponse.getSW());

	}
}
