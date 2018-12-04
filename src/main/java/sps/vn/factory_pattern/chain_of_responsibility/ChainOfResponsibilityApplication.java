package sps.vn.factory_pattern.chain_of_responsibility;

import sps.vn.factory_pattern.chain_of_responsibility.handler.PasswordValidatorHandler;
import sps.vn.factory_pattern.chain_of_responsibility.processor.AtLeastOneSpecialCharacterProcessor;
import sps.vn.factory_pattern.chain_of_responsibility.processor.EmptyPasswordProcessor;
import sps.vn.factory_pattern.chain_of_responsibility.processor.PasswordLengthMustBeTenCharacterProcessor;
import sps.vn.factory_pattern.chain_of_responsibility.request.Password;

public class ChainOfResponsibilityApplication {
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
