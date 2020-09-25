package model;

import java.util.List;

public interface ICamembertModel extends IAdaptateur {

	public String getTitre();
	public void setTitre(String titre);

	public List<Item> getItems();
	public void setItems(List<Item> items);
	
	public void addItem(Item item);
	public void delItem(Item item);
}
