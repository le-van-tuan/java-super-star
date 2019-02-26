package vn.sps.design_pattern.behavior.observer;

import vn.sps.design_pattern.behavior.observer.business.Editor;
import vn.sps.design_pattern.behavior.observer.subcribe.MailListener;
import vn.sps.design_pattern.behavior.observer.subcribe.SmsListener;

public class ObserverApplication {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.eventManager.subscribe("open", new MailListener("levantuan.itvn@gmail.com"));
        editor.eventManager.subscribe("open", new MailListener("nguyenTeo.test@gmail.com"));

        editor.eventManager.unsubscribe("open", new MailListener("levantuan.itvn@gmail.com"));
        editor.eventManager.unsubscribe("open", new MailListener("nguyenTeo.test@gmail.com"));

        editor.eventManager.subscribe("save", new SmsListener("0352194177"));

        editor.openFile("C:\\Users\\lvtuan\\Desktop\\SPS_Project\\Design Pattern\\pom.xml");
        editor.saveFile();
    }
}
