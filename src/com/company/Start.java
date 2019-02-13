package com.company;

import java.util.Scanner;

public class Start {

    public void startMenu() {
        Scanner textScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);
        String userInput;
        int userInputInt;
        Admin admin = new Admin();

        System.out.println("Welcome to the elite Fyre Fest fam, it's time to book your accommodations!\n" +
                "Press [1] Book a Room \n" +
                "Press [2] View/Edit existing booking \n" +
                "Press [3] Fyre Credits \n" +
                "Press [4] Check Matches \n" +
                "Press [4] Admin Access");

        userInputInt = numberScanner.nextInt();
        switch (userInputInt) {

            case 1:
                System.out.println("Welcome, what type of accommodation would you like to book? ");

                admin.viewAllAccommodations();

                switch (userInputInt) {
                    case 1: //Tent

                        break;
                    case 2: //Cabin

                        break;
                    case 3: //Mansion

                        break;


                }




                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

            default:
                break;


        }


    }


}
