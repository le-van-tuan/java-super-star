package vn.sps.design_pattern.behavior.observer.subcribe;

import java.io.File;

public class SmsListener implements EventListener {

    private String phoneNumber;

    public SmsListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void onUpdate(String eventType, File file) {
        System.out.println(String.format("Sms to [%s] - Some one has perform action [%s] on file [%s]", this.phoneNumber, eventType, file.getName()));
    }
}
