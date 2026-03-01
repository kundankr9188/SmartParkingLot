package model;

import enums.SpotType;

public class ParkingSpot {

    private String spotId;
    private SpotType spotType;
    private boolean occupied;

    public ParkingSpot(String spotId, SpotType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.occupied = false;
    }

    public String getSpotId() {
        return spotId;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy() {
        this.occupied = true;
    }

    public void free() {
        this.occupied = false;
    }
}