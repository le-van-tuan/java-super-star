package vn.sps.design_pattern.creational.factory_pattern.impl;

import vn.sps.design_pattern.creational.factory_pattern.factory.Creator;
import vn.sps.design_pattern.creational.factory_pattern.product.Button;
import vn.sps.design_pattern.creational.factory_pattern.product.WindowsButton;

public class WindowsDialog extends Creator {

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
