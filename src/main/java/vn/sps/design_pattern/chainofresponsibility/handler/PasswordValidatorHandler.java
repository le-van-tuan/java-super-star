package vn.sps.design_pattern.chainofresponsibility.handler;

public interface PasswordValidatorHandler<T> {
    /**
     *
     * @param handler
     */
    void setNextValidate(PasswordValidatorHandler<T> handler);

    /**
     *
     * @param request
     */
    void handleValidate(T request);
}
