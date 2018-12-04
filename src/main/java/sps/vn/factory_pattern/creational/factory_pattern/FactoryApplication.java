package sps.vn.factory_pattern.creational.factory_pattern;

import sps.vn.factory_pattern.creational.factory_pattern.factory.Creator;
import sps.vn.factory_pattern.creational.factory_pattern.impl.WebDialog;
import sps.vn.factory_pattern.creational.factory_pattern.impl.WindowsDialog;

public class FactoryApplication {

    private static Creator creator;

    static {
        if (System.getProperty("os.name").equals("Windows 10")) {
            creator = new WindowsDialog();
        } else {
            creator = new WebDialog();
        }
    }

    public static void main(String[] args) {
        creator.renderButton();
    }
}
