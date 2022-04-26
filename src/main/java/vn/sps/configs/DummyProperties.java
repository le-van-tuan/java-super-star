package vn.sps.configs;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DummyProperties {

    @PostConstruct
    private void postConstruct() {
        System.out.println("Post construct dummy properties.");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("Pre destroy dummy properties.");
    }

    private String applicationName = "Dummy Application";

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
