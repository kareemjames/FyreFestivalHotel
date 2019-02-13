package com.company;

import java.util.Scanner;

public class Start {

    public void startMenu() {
        Scanner textScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);
        String userInput;
        int userInputInt;

        System.out.println("Welcome to the elite Fyre Fest fam, it's time to book your accommodations!\n" +
                "Press [1] Book a Room \n" +
                "Press [2] View/Edit existing booking \n" +
                "Press [3] Fyre Credits \n" +
                "Press [4] Check Matches \n" +
                "Press [4] Admin Access");

        userInputInt = numberScanner.nextInt();
        switch (userInputInt) {

            case 1:
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
