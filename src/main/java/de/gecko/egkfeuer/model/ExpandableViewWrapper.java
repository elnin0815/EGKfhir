package de.gecko.egkfeuer.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class ExpandableViewWrapper<E>
{
	private final BooleanProperty expanded = new SimpleBooleanProperty(false);
	private final E item;
	
	public ExpandableViewWrapper(E item)
	{
		this.item = item;
	}
	
	public BooleanProperty expanded()
	{
		return expanded;
	}
	
	public E getItem()
	{
		return item;
	}
}
