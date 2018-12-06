package vn.sps.design_pattern.chain_of_responsibility.handler;

import vn.sps.design_pattern.chain_of_responsibility.request.Password;

public abstract class BasePasswordValidatorHandler {

    private PasswordValidatorHandler<Password> nextHandler;

    /**
     *
     * @param handler
     */
    protected void setNext(PasswordValidatorHandler<Password> handler) {
        this.nextHandler = handler;
    }

    /**
     *
     * @param request
     */
    protected void handle(Password request) {
        if(this.nextHandler != null){
            this.nextHandler.handleValidate(request);
        }else {
            System.out.println("Finish password validator");
        }
    }
}
