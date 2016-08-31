package de.gecko.egkfeuer.exception.smartcard;

public class EgkNotFoundException extends CardException
{
	private static final long serialVersionUID = 1L;

	public EgkNotFoundException()
	{
		super();
	}

	public EgkNotFoundException(String message)
	{
		super(message);
	}

	public EgkNotFoundException(Throwable cause)
	{
		super(cause);
	}
	
	public EgkNotFoundException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
