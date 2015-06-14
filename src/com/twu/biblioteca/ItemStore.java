package com.twu.biblioteca;
import java.util.List;

/**
 * Created by Administrator on 2015/6/12.
 */
public abstract class ItemStore {
    public List itemList;

    public ItemStore(List itemList) {
        this.itemList = itemList;
        dataInit();
    }

    abstract void dataInit();

    public List<Item> itemList(){return itemList;}

    public void checkoutItem(int choice){itemList.remove(choice-1);}

    public int itemsCount(){return itemList.size();}

    public void reserveItem(Item item){itemList.add(item);}

}
