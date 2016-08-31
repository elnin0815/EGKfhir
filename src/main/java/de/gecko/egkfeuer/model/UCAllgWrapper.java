package de.gecko.egkfeuer.model;

import de.gecko.egkfeuer.model.ekg.v51.vd.UCAllgemeineVersicherungsdatenXML;

@Deprecated
public class UCAllgWrapper
{

	private UCAllgemeineVersicherungsdatenXML xmltree;

	public UCAllgWrapper(UCAllgemeineVersicherungsdatenXML xmltree)
	{
		this.xmltree = xmltree;
	}

	public String getKostentraegerkennung()
	{
		return String.valueOf(xmltree.getVersicherter().getVersicherungsschutz().getKostentraeger()
				.getKostentraegerkennung());
	}
}
