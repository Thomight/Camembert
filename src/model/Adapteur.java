package model;

import java.util.List;
import java.util.Observable;

public class Adapteur implements IAdaptateur{

    private Observable observable;
    private Object object;

    @Override
    public void update(Observable observable, Object object) {
        this.observable = observable;
        this.object = object;
    }

    @Override
    public void addObserver(Object arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public int size() {
        if (object instanceof ICamembertModel){
            return ((ICamembertModel) object).getItems().size();
        }
        return 0;
    }

    @Override
    public int getValues(int i) {
        if (object instanceof ICamembertModel){
            Item item = ((ICamembertModel) object).getItems().get(i);
            if (item != null) {
                return item.getValeur();
            }
        }
        return 0;
    }

    @Override
    public int total() {
        int total = 0;
        if (object instanceof ICamembertModel){
            List<Item> items = ((ICamembertModel) object).getItems();
            for (Item i : items) {
                total += i.getValeur();
            }
        }
        return total;
    }

    @Override
    public String getTitle() {
        if (object instanceof ICamembertModel){
            return ((ICamembertModel) object).getTitre();
        }
        return null;
    }

    @Override
    public String getUnit() {
        // TODO : peut-etre a modifier
        return "euros";
    }

    @Override
    public String getTitle(int i) {
        if (object instanceof ICamembertModel){
            Item item = ((ICamembertModel) object).getItems().get(i);
            if (item != null) {
                return item.getName();
            }
        }
        return null;
    }

    @Override
    public String getDescription(int i) {
        if (object instanceof ICamembertModel){
            Item item = ((ICamembertModel) object).getItems().get(i);
            if (item != null) {
                return item.getDescription();
            }
        }
        return null;
    }

}
