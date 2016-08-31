package de.gecko.egkfeuer.exception.smartcard;

public class CardNotEgkException extends CardException
{
	private static final long serialVersionUID = 1L;

	public CardNotEgkException()
	{
		super();
	}

	public CardNotEgkException(String message)
	{
		super(message);
	}

	public CardNotEgkException(Throwable cause)
	{
		super(cause);
	}
	
	public CardNotEgkException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
