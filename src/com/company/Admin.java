package com.company;

import java.util.ArrayList;
import java.util.List;

public class Admin {

    private String password = "password";
    private List<Tent> tents = new ArrayList<>(3);
    private List<Cabin> cabins = new ArrayList<>(2);
    private List<Mansion> mansions = new ArrayList<>(1);
    private List<Attendee> attendees = new ArrayList<>();



    public void viewAllAccommodations() {
        for (Tent tent: tents) {
            System.out.println("There are this many tents available: " + tents.size());
            tent.printDetails();

        }
    }

    public List<Tent> getTents() {
        return tents;
    }

    public void setTents(List<Tent> tents) {
        this.tents = tents;
    }

    public List<Cabin> getCabins() {
        return cabins;
    }

    public void setCabins(List<Cabin> cabins) {
        this.cabins = cabins;
    }

    public List<Mansion> getMansions() {
        return mansions;
    }

    public void setMansions(List<Mansion> mansions) {
        this.mansions = mansions;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }
}
