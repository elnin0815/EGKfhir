package de.gecko.egkfeuer.service;

import javax.smartcardio.CardTerminals;
import javax.smartcardio.TerminalFactory;

@SuppressWarnings("restriction")
public class CardTerminalsServiceImpl implements CardTerminalsService
{
	private final TerminalFactory terminalFactory = TerminalFactory.getDefault();

	@Override
	public CardTerminals terminals()
	{
		return terminalFactory.terminals();
	}
}
