package de.gecko.egkfeuer.exception.smartcard;

public class UnsupportedEgkException extends CardException
{
	private static final long serialVersionUID = 1L;

	public UnsupportedEgkException()
	{
		super();
	}

	public UnsupportedEgkException(String message)
	{
		super(message);
	}

	public UnsupportedEgkException(Throwable cause)
	{
		super(cause);
	}

	public UnsupportedEgkException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
