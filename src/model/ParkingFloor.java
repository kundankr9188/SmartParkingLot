package model;

import java.util.List;

public class ParkingFloor {

    private int floorNumber;
    private List<ParkingSpot> spots;

    public ParkingFloor(int floorNumber, List<ParkingSpot> spots) {
        this.floorNumber = floorNumber;
        this.spots = spots;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}