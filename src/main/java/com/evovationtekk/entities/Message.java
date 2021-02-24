package com.evovationtekk.entities;

public class Message {

    private IMessageTarget source;
    private IMessageTarget target;
    private String message;

    //
    // Constructors
    //
    public Message() { }

    public Message(IMessageTarget source, IMessageTarget target, String message) {
        this.source = source;
        this.target = target;
        this.message = message;
    }
    //
    // END
    //

    //
    // Getter & Setter
    //
    public IMessageTarget getSource() {
        return source;
    }

    public void setSource(IMessageTarget source) {
        this.source = source;
    }

    public IMessageTarget getTarget() {
        return target;
    }

    public void setTarget(IMessageTarget target) {
        this.target = target;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    //
    // END
    //
}
