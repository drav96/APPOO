package com.laborator2;

import java.util.Scanner;

/**
 * Created by lupeidragos on 5/25/17.
 */
public class MenuPrinter {

    public void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Send mail");
        System.out.println("2. Check last mail from inbox§");
        System.out.println("3. Check specific mail from inbox");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                clearConsole();
                System.out.println("Destination email:");
                String destinationEmail = scanner.next();

                System.out.println("Subject: ");
                String subject = scanner.next();

                System.out.println("Message: ");
                String content = scanner.next();

                MailController.getINSTANCE().performTask(MailAction.SEND, destinationEmail, subject, content);
                break;
            case 2:
                MailController.getINSTANCE().performTask(MailAction.CHECK, "0");
                break;
            case 3:
                clearConsole();
                System.out.println("Which message?");
                MailController.getINSTANCE().performTask(MailAction.CHECK, scanner.nextLine());
                break;
            default:
                System.out.println("Default choice");
                break;
        }
    }

    private void clearConsole() {
        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
    }
}
