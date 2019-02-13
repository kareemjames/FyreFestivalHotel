package com.company;

public class Tent extends Room {

    private String noOfCandles;

    public Tent() {

        this.noOfCandles = "2";
        super.setNumberOfBeds("4");
    }

    public String getNoOfCandles() {
        return noOfCandles;
    }

    public void setNoOfCandles(String noOfCandles) {
        this.noOfCandles = noOfCandles;
    }
}
