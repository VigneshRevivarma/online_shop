package com.example.online_shop.exception;

public class ExceptionItem extends IndexOutOfBoundsException{
    public ExceptionItem(String message){
        super(message);
    }
    public ExceptionItem() {
        super("Item is not present!");
    }
}
