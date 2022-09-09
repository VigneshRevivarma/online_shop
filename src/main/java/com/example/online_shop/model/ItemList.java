package com.example.online_shop.model;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    private List<Item> itemList;

    public List<Item> getItemList() {
        if (itemList==null){
            itemList = new ArrayList<>();
        }
        return itemList;
    }

    public void setItemList(List<Item> itemList) {this.itemList = itemList;}
}
