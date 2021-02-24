package com.evovationtekk.repositories;

import com.evovationtekk.entities.IMessageTarget;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.Session;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class SessionsRepository {
    Map<IMessageTarget, Session> sessions = new ConcurrentHashMap<>();

    public void addSession(IMessageTarget target, Session session) {
        sessions.put(target, session);
    }

    public void removeSession(IMessageTarget target) {
        sessions.remove(target);
    }

    public Map<IMessageTarget, Session> getSessions() {
        return sessions;
    }
}
