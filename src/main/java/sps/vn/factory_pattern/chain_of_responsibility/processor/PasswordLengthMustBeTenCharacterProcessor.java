package sps.vn.factory_pattern.chain_of_responsibility.processor;

import sps.vn.factory_pattern.chain_of_responsibility.handler.BasePasswordValidatorHandler;
import sps.vn.factory_pattern.chain_of_responsibility.handler.PasswordValidatorHandler;
import sps.vn.factory_pattern.chain_of_responsibility.request.Password;

public class PasswordLengthMustBeTenCharacterProcessor extends BasePasswordValidatorHandler implements PasswordValidatorHandler<Password> {
    @Override
    public void setNextValidate(PasswordValidatorHandler<Password> handler) {
        super.setNext(handler);
    }

    @Override
    public void handleValidate(Password request) {
        if (request.getRawPassword().length() != 10) {
            System.out.println("Password is required 10 character !!");
        } else {
            super.handle(request);
        }
    }
}
