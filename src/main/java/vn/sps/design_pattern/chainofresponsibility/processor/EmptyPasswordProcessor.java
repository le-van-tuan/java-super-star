package vn.sps.design_pattern.chainofresponsibility.processor;

import vn.sps.design_pattern.chainofresponsibility.handler.BasePasswordValidatorHandler;
import vn.sps.design_pattern.chainofresponsibility.handler.PasswordValidatorHandler;
import vn.sps.design_pattern.chainofresponsibility.request.Password;

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
