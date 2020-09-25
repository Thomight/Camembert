package model;

import java.util.Observer;

public interface IAdaptateur extends Observer {

    public void addObserver(Object object);

    public int size();
    public int getValues(int i);
	public int total();
	public String getTitle();
	public String getUnit();
	public String getTitle(int i);
	public String getDescription(int i);
	
}
