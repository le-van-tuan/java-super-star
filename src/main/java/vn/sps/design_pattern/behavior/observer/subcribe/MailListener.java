package vn.sps.design_pattern.behavior.observer.subcribe;

import java.io.File;

public class MailListener implements EventListener {

    private String mailAddress;

    public MailListener(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public void onUpdate(String eventType, File file) {
        System.out.println(String.format("Mail to [%s] - Some one has perform action [%s] on file [%s]", this.mailAddress, eventType, file.getName()));
    }

    @Override
    public String subscriberInfo() {
        return this.mailAddress;
    }
}
