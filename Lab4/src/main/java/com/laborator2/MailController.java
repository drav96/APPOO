package com.laborator2;

/**
 * Created by lupeidragos on 5/25/17.
 */
public class MailController {

    private static MailController INSTANCE = new MailController();

    public MailChecker mailChecker = new MailChecker("admin", "admin");

    private MailController() {}

    public static MailController getINSTANCE() {
        return INSTANCE;
    }

    public void performTask(MailAction action, String ... args) {
        switch (action) {
            case SEND :
                MailSender.writeTo(args[0], args[1], args[2]);
                break;
            case CHECK :
                mailChecker.readMail(Integer.parseInt(args[0]));
                break;
        }
    }
}
