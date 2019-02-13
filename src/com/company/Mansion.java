package com.company;

public class Mansion extends Room {

    private int freeMansionCredits;

    public Mansion() {
       freeMansionCredits = 500;
       super.setNumberOfBeds("9");
    }

    public int getFreeMansionCredits() {
        return freeMansionCredits;
    }

    public void setFreeMansionCredits(int freeMansionCredits) {
        this.freeMansionCredits = freeMansionCredits;
    }
}
