package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cabin extends Room {


    public Cabin() {
        super.setNumberOfBeds("8");
    }

    public void printDetails() {
        System.out.println("Number of Beds" + getNumberOfBeds());
        System.out.println("Amenities" + super.getAmenities());
        }
    }


