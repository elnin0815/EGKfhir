package de.gecko.egkfeuer.service;

import de.gecko.egkfeuer.model.PatientWrapper;

public interface CardReaderService
{
	PatientWrapper read() throws de.gecko.egkfeuer.exception.smartcard.CardException;

	boolean isCardReaderPresent();
}
