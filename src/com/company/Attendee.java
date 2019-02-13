package com.company;

public class Attendee {

    private String name;
    private int idNumber;
    private String emailAddress;
    private String creditCardNumber;
    private String interest;
    private Room roomType;
    private int credit;

    public Attendee(String name, String emailAddress, String creditCardNumber, String interest) {
        this.name = name;
        idNumber = 100;
        this.emailAddress = emailAddress;
        this.creditCardNumber = creditCardNumber;
        this.interest = interest;
        this.roomType = new Room();
        credit = 0;
    }


    public void addFyreCredits(int userCredit) {
        credit += userCredit;
        System.out.println("Your balance is now: " + credit);
    }

    public boolean subtractCostFromCredit(int amountSubtractedFromCredits) {

        if (credit > amountSubtractedFromCredits) {
            credit -= amountSubtractedFromCredits;
            System.out.println("Your new balance: " + credit);
            return true;
        } else {
            System.out.println("Please got to main menu and add credits");
            return false;
        }

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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
