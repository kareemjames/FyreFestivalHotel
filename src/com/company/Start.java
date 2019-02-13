package com.company;

import java.util.Scanner;

public class Start {

    public void startMenu() {
        Scanner textScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);
        String userInput;
        int userInputInt;
        Admin admin = new Admin();
        Attendee tempAttendee;
        IDNumber idNumber = new IDNumber();

        System.out.println("Welcome to the elite Fyre Fest fam, it's time to book your accommodations!\n" +
                "Press [1] Register\n" +
                "Press [2] Book a Room \n" +
                "Press [3] View/Edit existing booking \n" +
                "Press [4] Fyre Credits \n" +
                "Press [5] Check Matches \n" +
                "Press [6] Admin Access");

        userInputInt = numberScanner.nextInt();
        switch (userInputInt) {

            case 1:
                System.out.println("Welcome to registration, please provide us with your name");
                String tempName = textScanner.nextLine();
                System.out.println("Email");
                String tempEmail = textScanner.nextLine();
                System.out.println("Interest e.g. Art, Snowboarding");
                String tempInterest = textScanner.nextLine();
                System.out.println("How many credits would you like to add to your account?");
                int tempCredit = numberScanner.nextInt();
                System.out.println("Credit card number");
                String tempCreditCardNumber = textScanner.nextLine();
                tempAttendee = new Attendee(tempName, tempEmail, tempCreditCardNumber, tempInterest);
                tempAttendee.setCredit(tempCredit);
                tempAttendee.setIdNumber(idNumber.incrementer());
                admin.addAttendee(tempAttendee);
                System.out.println("Thanks for registering");
                break;
            case 2:
                //Cabin
                //Tent
                System.out.println("If you have a party of 4 or less this is our economy option" +
                        "It includes beds and a couple of candles for light and warmth.");
                break;
            case 3: //Mansion
                break;
            default:
                break;
        }



    }


}


