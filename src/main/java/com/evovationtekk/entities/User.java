package com.evovationtekk.entities;

public class User implements IMessageTarget {
    public String id;
    public String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
