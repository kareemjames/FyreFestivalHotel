package com.company;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String numberOfBeds;
    private List<String> amenities;


    public Room(){
        amenities = new ArrayList<String>();
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
}
