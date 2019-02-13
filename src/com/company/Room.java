package com.company;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String numberOfBeds;
    private List<String> amenities;
    private boolean isBooked;
    private int pricePerNight;


    public Room(){
        amenities = new ArrayList<String>();
        isBooked = false;
        pricePerNight = 0;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds='" + numberOfBeds + '\'' +
                ", amenities=" + amenities +
                ", isBooked=" + isBooked +
                ", pricePerNight=" + pricePerNight +
                '}';
    }

    public int calculatePriceForStay(int numberOfNights){
        int totalCost = numberOfNights * pricePerNight;
        System.out.println(totalCost);

        return totalCost;
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

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
