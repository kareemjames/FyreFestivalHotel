package com.company;

public class Tent extends Room {

    private String noOfCandles;

    public Tent() {

        this.noOfCandles = "2";
        super.setNumberOfBeds("4");
    }

    @Override
    public void printDetails() {
        System.out.println("Candles: " + noOfCandles);
        System.out.println("Number of Beds" + getNumberOfBeds());
    }

    public String getNoOfCandles() {
        return noOfCandles;
    }

    public void setNoOfCandles(String noOfCandles) {
        this.noOfCandles = noOfCandles;
    }
}
