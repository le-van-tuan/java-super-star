package vn.sps.design_pattern.chain_of_responsibility.processor;

import vn.sps.design_pattern.chain_of_responsibility.handler.BasePasswordValidatorHandler;
import vn.sps.design_pattern.chain_of_responsibility.handler.PasswordValidatorHandler;
import vn.sps.design_pattern.chain_of_responsibility.request.Password;

public class AtLeastOneSpecialCharacterProcessor extends BasePasswordValidatorHandler implements PasswordValidatorHandler<Password> {

    @Override
    public void setNextValidate(PasswordValidatorHandler<Password> handler) {
        super.setNext(handler);
    }

    @Override
    public void handleValidate(Password request) {
        if (!request.getRawPassword().matches(".*[@#$%^&+=].*")) {
            System.out.println("Password does not contain special character !!!");
        } else {
            super.handle(request);
        }
    }
}
