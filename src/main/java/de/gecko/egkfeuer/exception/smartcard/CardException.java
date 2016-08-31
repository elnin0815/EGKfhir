package de.gecko.egkfeuer.exception.smartcard;

public class CardException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public CardException()
	{
		super();
	}

	public CardException(String message)
	{
		super(message);
	}

	public CardException(Throwable cause)
	{
		super(cause);
	}

	public CardException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
