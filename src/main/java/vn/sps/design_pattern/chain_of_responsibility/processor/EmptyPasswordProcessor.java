package vn.sps.design_pattern.chain_of_responsibility.processor;

import vn.sps.design_pattern.chain_of_responsibility.handler.BasePasswordValidatorHandler;
import vn.sps.design_pattern.chain_of_responsibility.handler.PasswordValidatorHandler;
import vn.sps.design_pattern.chain_of_responsibility.request.Password;

public class EmptyPasswordProcessor extends BasePasswordValidatorHandler implements PasswordValidatorHandler<Password> {

    @Override
    public void setNextValidate(PasswordValidatorHandler<Password> handler) {
        super.setNext(handler);
    }

    @Override
    public void handleValidate(Password request) {
        if(request.getRawPassword() == null || request.getRawPassword().isEmpty()){
            System.out.println("Password is empty !!!");
        }else {
            super.handle(request);
        }
    }
}
