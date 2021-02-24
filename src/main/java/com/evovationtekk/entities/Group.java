package com.evovationtekk.entities;

public class Group implements IMessageTarget {

    private String id;
    private String name;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
