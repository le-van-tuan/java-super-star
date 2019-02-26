package vn.sps.design_pattern.behavior.observer.publisher;

import vn.sps.design_pattern.behavior.observer.subcribe.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<EventListener>> listener = new HashMap<>();

    public EventManager(String... eventType) {
        for (String s : eventType) {
            this.listener.put(s, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> listeners = this.listener.get(eventType);
        listeners.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> listeners = this.listener.get(eventType);
        listeners.removeIf(lt -> lt.subscriberInfo().equals(listener.subscriberInfo()));
    }

    public void notify(String eventType, File file) {
        List<EventListener> listeners = this.listener.get(eventType);
        listeners.forEach(lt -> lt.onUpdate(eventType, file));
    }
}
