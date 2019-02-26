package vn.sps.design_pattern.behavior.observer.business;

import vn.sps.design_pattern.behavior.observer.publisher.EventManager;

import java.io.File;

public class Editor {

    public EventManager eventManager;

    private File file;

    public Editor() {
        this.eventManager = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        System.out.println("File has created success!");
        eventManager.notify("open", this.file);
    }

    public void saveFile() {
        doSaveFile();
        this.eventManager.notify("save", this.file);
    }

    private void doSaveFile() {
        System.out.println("File has saved!");
    }
}
