package com.example.online_shop.dao;

import com.example.online_shop.exception.ExceptionItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DAOItem {
    private static Items list = new Items();

    static {
        list.getItemList().add(new Item(0,"item_1","this is item 1","image-path1",12.0));
        list.getItemList().add(new Item(0,"item_2","this is item 2","image-path2",40.0));
        list.getItemList().add(new Item(0,"item_3","this is item 3","image-path3",56.0));
        list.getItemList().add(new Item(0,"item_4","this is item 4","image-path4",96.0));
        list.getItemList().add(new Item(0,"item_5","this is item 5","image-path5",140.0));
    }

    public List<Item> getItemList(){return list.getItemlist();}

    public void addItem(Item item) { list.getItemList().add(item);}

    public Item getItem(int id) throws ExceptionItem
    {
        if(id>=list.getItemList().size()){
            throw new ExceptionItem();
        }
        return list.getItemList().get(id);
    }

    public void delete(int id) throws ExceptionItem
    {
        list.getItemList().remove(id);
    }
}
