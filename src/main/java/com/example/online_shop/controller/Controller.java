package com.example.online_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/item")
public class Controller {

    @Autowired
    private DAOItem DAOITEM;

    @GetMapping(path="/item",produces = "application/json")
    public List<Item> getItems() {return DAOITEM.getItemList();}

    
}
