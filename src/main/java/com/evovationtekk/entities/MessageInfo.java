package com.evovationtekk.entities;

public class MessageInfo {

    private MessageType type;
    private Message msg;

    //
    // Constructors
    //
    public MessageInfo() { }

    public MessageInfo(MessageType type, Message msg) {
        this.type = type;
        this.msg = msg;
    }
    //
    // END
    //

    //
    // Getter & Setter
    //
    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public Message getMsg() {
        return msg;
    }

    public void setMsg(Message msg) {
        this.msg = msg;
    }
    //
    // END
    //
}
