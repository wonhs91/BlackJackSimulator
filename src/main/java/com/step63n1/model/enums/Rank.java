package com.step63n1.model.enums;

public enum Rank {
	Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(10), Queen(10), King(10);
	

    private int numVal;

    Rank(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
