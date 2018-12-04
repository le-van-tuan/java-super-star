package sps.vn.factory_pattern.creational.factory_pattern.factory;

import sps.vn.factory_pattern.creational.factory_pattern.product.Button;

public abstract class Creator {

    public void renderButton(){
        Button button = this.createButton();
        button.render();
    }

    protected abstract Button createButton();
}
