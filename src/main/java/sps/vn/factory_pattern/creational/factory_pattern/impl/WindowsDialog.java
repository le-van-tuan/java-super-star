package sps.vn.factory_pattern.creational.factory_pattern.impl;

import sps.vn.factory_pattern.creational.factory_pattern.factory.Creator;
import sps.vn.factory_pattern.creational.factory_pattern.product.Button;
import sps.vn.factory_pattern.creational.factory_pattern.product.WindowsButton;

public class WindowsDialog extends Creator {

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
