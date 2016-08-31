package de.gecko.egkfeuer.service.smartcard;

import javacard.framework.APDU;
import javacard.framework.ISO7816;
import javacard.framework.ISOException;
import javacardx.apdu.ExtendedLength;

import com.licel.jcardsim.samples.BaseApplet;


public class NonEgkSim extends BaseApplet implements ExtendedLength
{	
	protected NonEgkSim()  {
		register();
	}

	/**
	 * This method is called once during applet instantiation process.
	 * 
	 * @param bArray
	 *            the array containing installation parameters
	 * @param bOffset
	 *            the starting offset in bArray
	 * @param bLength
	 *            the length in bytes of the parameter data in bArray
	 * @throws ISOException
	 *             if the install method failed
	 */
	public static void install(byte[] bArray, short bOffset, byte bLength) throws ISOException
	{
		new NonEgkSim();
	}
	

	@Override
	public void process(APDU apdu)
	{
		if (selectingApplet())
			return;

		ISOException.throwIt(ISO7816.SW_CLA_NOT_SUPPORTED);
	}
}