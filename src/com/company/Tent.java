package com.company;

public class Tent extends Room {

    private String noOfCandles;

    public Tent() {

        this.noOfCandles = "2";
        super.setNumberOfBeds("4");
        super.setPricePerNight(1000);
    }

    @Override
    public String toString() {
        return "Tent{" +
                "noOfCandles='" + noOfCandles + '\'' +
                '}';
    }

    public void printDetails() {
        System.out.println("Candles: " + noOfCandles);
        System.out.println("Number of Beds" + getNumberOfBeds());
        System.out.println("Price");
    }

    public String getNoOfCandles() {
        return noOfCandles;
    }

    public void setNoOfCandles(String noOfCandles) {
        this.noOfCandles = noOfCandles;
    }
}
