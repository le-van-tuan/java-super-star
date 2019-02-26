package vn.sps.design_pattern.behavior.observer.subcribe;

import java.io.File;

public interface EventListener {
    void onUpdate(String eventType, File file);
}
