package de.gecko.egkfeuer.exception.smartcard;

public class CardAccessException extends CardException
{
	private static final long serialVersionUID = 1L;

	public CardAccessException()
	{
		super();
	}
	
	public CardAccessException(String message)
	{
		super(message);
	}

	public CardAccessException(Throwable cause)
	{
		super(cause);
	}
	
	public CardAccessException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
