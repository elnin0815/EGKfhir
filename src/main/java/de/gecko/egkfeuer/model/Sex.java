package de.gecko.egkfeuer.model;

public enum Sex
{
	MALE, FEMALE;

	public String getDbName()
	{
		return name();
	}

	/**
	 * @param dbName
	 *            may be <code>null</code>
	 * @return <code>null</code> if param <code>dbName</code> is
	 *         <code>null</code> or not 'matchable'
	 */
	public static Sex fromDbName(String dbName)
	{
		if (MALE.getDbName().equals(dbName))
			return MALE;
		else if (FEMALE.getDbName().equals(dbName))
			return FEMALE;
		else
			return null;
	}
}