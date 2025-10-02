package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber("3456789-9876543");
        cellPhone1.setModel("Iphone 15");
        cellPhone1.setCarrier("Verizon");
        cellPhone1.setPhoneNumber("708-374-6831");
        cellPhone1.setOwner("Diana Ross");
        cellPhone1.display();
    }
}
