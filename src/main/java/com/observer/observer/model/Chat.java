package com.observer.observer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Chat implements Observable{

    private List<Observer> observers;

    @Autowired
    public Chat(List<Observer> observers)  {
        this.observers = observers;

    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        if(!observers.contains(observer)) {
            System.out.println("no such observer ");
            return;
        }
        observers.remove(observer);

    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> {observer.update(message);});
    }

    public void sendChat(String message) {
        notifyObservers(message);
    }
}
