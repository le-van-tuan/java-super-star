package vn.sps.design_pattern.creational.factory_pattern;

import vn.sps.design_pattern.creational.factory_pattern.factory.Creator;
import vn.sps.design_pattern.creational.factory_pattern.impl.WebDialog;
import vn.sps.design_pattern.creational.factory_pattern.impl.WindowsDialog;

public class FactoryApplication {

    private static final Creator creator;

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
