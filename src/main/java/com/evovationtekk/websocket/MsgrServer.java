package com.evovationtekk.websocket;

import com.evovationtekk.entities.Message;
import com.evovationtekk.entities.MessageInfo;
import com.evovationtekk.entities.MessageType;
import com.evovationtekk.entities.User;
import com.evovationtekk.repositories.SessionsRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/msgr/{userId}")
@ApplicationScoped
public class MsgrServer {

    @Inject
    public SessionsRepository sessionsRepo;

    @OnOpen
    public void onConnectionOpened(Session session, @PathParam("userId") String userId) {
        var user = new User("TestUser");
        sessionsRepo.addSession(user, session);
        sendMessage(new MessageInfo(MessageType.JOIN, new Message(user, user, "joined the server.")));
    }

    @OnClose
    public void onConnectionClosed(Session session, @PathParam("userId") String userId) {
        var user = new User("TestUser");
        sessionsRepo.removeSession(user);
    }

    @OnError
    public void onError(Session session, @PathParam("userId") String userId, Throwable throwable) {

    }

    @OnMessage
    public void onMessage(String message, @PathParam("userId") String userId) {

    }

    public void sendMessage(MessageInfo info) {
        var sessions = sessionsRepo.getSessions();
        switch (info.getType()) {
            case JOIN:
                break;
            case LEAVE:
                break;
            case ERROR:
                break;
            case USER:
                break;
            case GROUP:
                break;
            case BROADCAST:
                break;
        }
    }
}