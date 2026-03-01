package service;

import enums.VehicleType;

public class FeeCalculator {

    public static double calculateFee(long hours, VehicleType type) {

        switch (type) {
            case MOTORCYCLE:
                return hours * 10;
            case CAR:
                return hours * 20;
            case BUS:
                return hours * 50;
            default:
                return 0;
        }
    }
}