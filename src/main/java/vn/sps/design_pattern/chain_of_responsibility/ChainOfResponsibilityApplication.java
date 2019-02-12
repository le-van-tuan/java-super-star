package vn.sps.design_pattern.chain_of_responsibility;

import vn.sps.design_pattern.chain_of_responsibility.handler.PasswordValidatorHandler;
import vn.sps.design_pattern.chain_of_responsibility.processor.AtLeastOneSpecialCharacterProcessor;
import vn.sps.design_pattern.chain_of_responsibility.processor.EmptyPasswordProcessor;
import vn.sps.design_pattern.chain_of_responsibility.processor.PasswordLengthMustBeTenCharacterProcessor;
import vn.sps.design_pattern.chain_of_responsibility.request.Password;

public class ChainOfResponsibilityApplication {
    /*
    * https://medium.com/@alialhaddad/fetching-data-in-react-native-d92fb6876973
    * */

    /**
     * Authentication flow
     * https://reactnavigation.org/docs/en/2.x/auth-flow.html
     * @param args
     */
    public static void main(String[] args) {
        Password password = new Password();
        password.setRawPassword("1234567890@");

        PasswordValidatorHandler<Password> step1 = new EmptyPasswordProcessor();
        PasswordValidatorHandler<Password> step2 = new PasswordLengthMustBeTenCharacterProcessor();
        PasswordValidatorHandler<Password> step3 = new AtLeastOneSpecialCharacterProcessor();

        step1.setNextValidate(step2);
        step2.setNextValidate(step3);

        step1.handleValidate(password);
    }
}
