package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();
        CellPhone cellPhone = new CellPhone();

        System.out.println("What is the Serial Number?: ");
        myPhone.setSerialNumber(scanner.nextInt());
        cellPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What model is the phone? ");
        myPhone.setModel(scanner.nextLine());
        cellPhone.setModel(scanner.nextLine());

        System.out.println("What is the Carrier?: ");
        myPhone.setCarrier(scanner.nextLine());
        cellPhone.setCarrier(scanner.nextLine());

        System.out.println("What is the Phone Number?: ");
        myPhone.setPhoneNumber(scanner.nextLine());
        cellPhone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the Owner?: ");
        myPhone.setOwner(scanner.nextLine());
        cellPhone.setOwner(scanner.nextLine());

        cellPhone.dial();

        myPhone.dial();

        display(cellPhone);

        display(myPhone);

    }
    public static void display(CellPhone myPhone) {
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Phone model: " + myPhone.getSerialNumber());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Phone Owner: " + myPhone.getOwner());
    }
}
