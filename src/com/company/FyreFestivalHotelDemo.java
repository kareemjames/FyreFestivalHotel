package com.company;

import java.util.ArrayList;
import java.util.List;

public class FyreFestivalHotelDemo {

    public static void main(String[] args) {

        Tent tent = new Tent();
        System.out.println(tent.getNumberOfBeds());

        Cabin cabin = new Cabin();
        List cabinAmenities = new ArrayList();
        cabinAmenities.add("fridge");
        cabin.setAmenities(cabinAmenities);
        System.out.println(cabin.getAmenities());

        Mansion mansion = new Mansion();
        System.out.println(mansion.getFreeMansionCredits());
        System.out.println(mansion.getNumberOfBeds());
        System.out.println(mansion.getAmenities());


    }
}
