package com.observer.observer.model;

import com.observer.observer.model.Observer;

public class User implements Observer {

    private String name;

    public User(String name ) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println(name  + " has received the message : " + message);
    }


}
