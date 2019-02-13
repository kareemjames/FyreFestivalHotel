package com.company;

import java.util.ArrayList;
import java.util.List;

public class Admin {

    private String password = "password";
    private List<Tent> tents = new ArrayList<>(3);
    private List<Cabin> cabins = new ArrayList<>(2);
    private List<Mansion> mansions = new ArrayList<>(1);
    private List<Attendee> attendees = new ArrayList<>();
    private Attendee foundAttendee;


    public Attendee searchByID(int userID){


        for (int i = 0; i <attendees.size() ; i++) {
            if (userID == attendees.get(i).getIdNumber()){
                foundAttendee = attendees.get(i);
                System.out.println("Found " + foundAttendee.getName() + "'s profile." );
                break;
            } else {
                System.out.println("Not found");
            }
        }
        return foundAttendee;
    }


    public void viewAllAccommodations() {
        System.out.println("this is running");

        if (tents.isEmpty()) {
            System.out.println("All tents are available");
        }

        System.out.println(tents.size());
    }

    public void addTent(Tent tent) {
        tents.add(tent);
        System.out.println(tents.size());
    }

    public void addAttendee(Attendee attendee) {
        attendees.add(attendee);
        System.out.println(attendee);
        System.out.println(attendees.size());
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
