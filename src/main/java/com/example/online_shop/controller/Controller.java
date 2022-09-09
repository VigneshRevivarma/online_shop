package com.example.online_shop.controller;

import com.example.online_shop.dao.DAOItem;
import com.example.online_shop.exception.ExceptionItem;
import com.example.online_shop.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path="/item")
public class Controller {

    @Autowired
    private DAOItem DAOITEM;

    @GetMapping(path="/item",produces = "application/json")
    public List<Item> getItems() {return DAOITEM.getItemList();}

    @GetMapping(path="/item/{id}", produces = "application/json")
    public Item getItemList(@PathVariable() String id) throws ExceptionItem
    {
        return DAOITEM.getItem(Integer.parseInt(id));
    }


    @PostMapping(path="/item", consumes = "application/json")
    public ResponseEntity<Object> updateItems(@RequestBody Item i) {
        int id = DAOITEM.getItemList().size() + 1;
        DAOITEM.addItem(i);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/item/id").buildAndExpand(i.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path="/item/{id}")
    public void deleteItems(@PathVariable() String id) { DAOITEM.delete(Integer.parseInt(id));}
}


