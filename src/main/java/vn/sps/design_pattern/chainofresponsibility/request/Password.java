package vn.sps.design_pattern.chainofresponsibility.request;

public class Password {

    private String rawPassword;

    public Password(String rawPassword) {
        this.rawPassword = rawPassword;
    }

    public Password() {

    }

    public String getRawPassword() {
        return rawPassword;
    }

    public void setRawPassword(String rawPassword) {
        this.rawPassword = rawPassword;
    }
}
