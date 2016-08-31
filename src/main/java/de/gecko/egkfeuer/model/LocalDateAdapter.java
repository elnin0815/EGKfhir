package de.gecko.egkfeuer.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate>
{
	@Override
	public LocalDate unmarshal(String v) throws Exception
	{
		return v == null ? null : LocalDate.parse(v);
	}

	@Override
	public String marshal(LocalDate v) throws Exception
	{
		return v == null ? null : v.toString();
	}
}
