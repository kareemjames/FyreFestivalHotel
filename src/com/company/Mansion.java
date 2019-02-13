package com.company;

public class Mansion extends Room {

    private int freeMansionCredits;

    public Mansion() {
       freeMansionCredits = 500;
       super.setNumberOfBeds("9");
       super.setPricePerNight(1000);

    }

    @Override
    public String toString() {
        return "Mansion{" +
                "freeMansionCredits=" + freeMansionCredits +
                '}';
    }

    public void printDetails(){
        System.out.println(freeMansionCredits);
        System.out.println(super.getNumberOfBeds());
        System.out.println(super.getAmenities());
    }

    public int getFreeMansionCredits() {
        return freeMansionCredits;
    }

    public void setFreeMansionCredits(int freeMansionCredits) {
        this.freeMansionCredits = freeMansionCredits;
    }
}
