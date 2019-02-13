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
        boolean running = true;
        boolean hasTheCredits;

        do {


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
                    System.out.println("Thanks for booking accommodations! " +
                            "If you have a party of 4 or less this is our economy option" +
                            "It includes beds and a couple of candles for light and warmth.");

                    System.out.println("To book room, please enter your ID number from your registration: ");
                    userInputInt = numberScanner.nextInt();

                    tempAttendee = admin.searchByID(userInputInt);

                    System.out.println("Your current balance is: " + tempAttendee.getCredit());

                    System.out.println("Tent Cost: $1000/night" +
                            "How many nights would you like to stay?");

                    userInputInt = numberScanner.nextInt();

                    Tent tent = new Tent();
                    int totalCostOfStay = tent.calculatePriceForStay(userInputInt);
                    System.out.println("Total cost of stay: " + totalCostOfStay);
                    hasTheCredits = tempAttendee.subtractCostFromCredit(totalCostOfStay);

                    if(hasTheCredits) {
                        tempAttendee.setRoomType(tent);
                    }

                    System.out.println(tempAttendee);
                    break;
                case 3: //Mansion
                    break;
                default:
                    break;
            }

//            System.out.println("Main menu?");
//            userInput = textScanner.nextLine();
//            running = userInput.equalsIgnoreCase("y") ? true : false;

        } while(running);

    }


}


