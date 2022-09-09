package com.example.online_shop.dao;

import com.example.online_shop.exception.ExceptionItem;
import com.example.online_shop.model.Item;
import com.example.online_shop.model.ItemList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DAOItem {
    private static ItemList list = new ItemList();

    static {
        list.getItemList().add(new Item(1,"item_1","this is item 1","image-path1",12.0));
        list.getItemList().add(new Item(2,"item_2","this is item 2","image-path2",40.0));
        list.getItemList().add(new Item(3,"item_3","this is item 3","image-path3",56.0));
        list.getItemList().add(new Item(4,"item_4","this is item 4","image-path4",96.0));
        list.getItemList().add(new Item(5,"item_5","this is item 5","image-path5",140.0));
    }

    public List<Item> getItemList(){return list.getItemList();}

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
