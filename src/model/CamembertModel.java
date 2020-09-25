package model;

import java.util.ArrayList;
import java.util.List;

public class CamembertModel extends Adapteur implements ICamembertModel {
    
    private String titre;
    private List<Item> items;
    
    /**
     * 
     */
    public CamembertModel(String titre) {
        this.titre = titre;
        items = new ArrayList<Item>();
    }

    @Override
    public String getTitre() {
        return titre;
    }
    
    @Override
    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public List<Item> getItems() {
        return this.items;
    }

    @Override
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public void delItem(Item item) {
        this.items.remove(item);
    }


}
