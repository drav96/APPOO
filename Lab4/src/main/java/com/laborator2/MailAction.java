package com.laborator2;

/**
 * Created by lupeidragos on 5/25/17.
 */
public enum MailAction {

    SEND("send"),
    CHECK("check");

    String action;

    MailAction(String action) {
        this.action = action;
    }

}
