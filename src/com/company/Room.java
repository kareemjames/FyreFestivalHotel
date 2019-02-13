package com.company;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String numberOfBeds;
    private List<String> amenities;
    private boolean isBooked;


    public Room(){
        amenities = new ArrayList<String>();
        isBooked = false;
    }

    public void printDetails(){
        System.out.println(numberOfBeds);
        System.out.println(amenities);
        System.out.println(isBooked);

    }

    public Room(String numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(String numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
