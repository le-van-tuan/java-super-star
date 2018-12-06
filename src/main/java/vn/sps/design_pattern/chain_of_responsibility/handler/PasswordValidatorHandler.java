package vn.sps.design_pattern.chain_of_responsibility.handler;

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
