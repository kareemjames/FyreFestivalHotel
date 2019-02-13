package com.company;

public class Attendee {

    private String name;
    private int idNumber;
    private String emailAddress;
    private String creditCardNumber;
    private String interest;
    private Room roomType;

    public Attendee(String name, int idNumber, String emailAddress, String creditCardNumber, String interest) {
        this.name = name;
        this.idNumber = idNumber;
        this.emailAddress = emailAddress;
        this.creditCardNumber = creditCardNumber;
        this.interest = interest;
        this.roomType = new Room();
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", interest='" + interest + '\'' +
                ", roomType=" + roomType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Room getRoomType() {
        return roomType;
    }

    public void setRoomType(Room roomType) {
        this.roomType = roomType;
    }
}
