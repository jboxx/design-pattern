package io.jboxx.designpattern.strategypattern.implementation1.style;

public class StanceStyle implements IStyle {

    private final String color;
    private final String artist;
    private final int numberOfDoors;

    public StanceStyle(String color, String artist, int numberOfDoors) {
        this.color = color;
        this.artist = artist;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String styleColor() {
        return color;
    }

    @Override
    public String styleType() {
        return "Stance";
    }

    @Override
    public String styleArtist() {
        return artist;
    }

    @Override
    public int styleNumberOfDoors() {
        return numberOfDoors;
    }
}
