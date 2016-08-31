package de.gecko.egkfeuer.exception.smartcard;

public class CardDecisionException extends CardException
{
	private static final long serialVersionUID = 1L;

	public CardDecisionException()
	{
		super();
	}

	public CardDecisionException(String message)
	{
		super(message);
	}

	public CardDecisionException(Throwable cause)
	{
		super(cause);
	}
	
	public CardDecisionException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
