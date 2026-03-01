package service;

import enums.SpotType;
import enums.VehicleType;
import model.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class ParkingService {

    private ParkingLot parkingLot;
    private Map<String, Ticket> activeTickets = new HashMap<>();

    public ParkingService(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Ticket parkVehicle(Vehicle vehicle) {

        SpotType requiredSpot = mapVehicleToSpot(vehicle.getVehicleType());

        for (ParkingFloor floor : parkingLot.getFloors()) {
            for (ParkingSpot spot : floor.getSpots()) {

                if (!spot.isOccupied() && spot.getSpotType() == requiredSpot) {

                    spot.occupy();

                    String ticketId = UUID.randomUUID().toString();
                    Ticket ticket = new Ticket(ticketId, vehicle, spot);
                    activeTickets.put(ticketId, ticket);

                    System.out.println("Vehicle parked at spot: " + spot.getSpotId());
                    return ticket;
                }
            }
        }

        System.out.println("Parking Full!");
        return null;
    }

    public void unparkVehicle(String ticketId) {

        Ticket ticket = activeTickets.get(ticketId);

        if (ticket == null) {
            System.out.println("Invalid Ticket!");
            return;
        }

        LocalDateTime exitTime = LocalDateTime.now();
        long hours = Duration.between(ticket.getEntryTime(), exitTime).toHours();
        if (hours == 0) hours = 1;

        double fee = FeeCalculator.calculateFee(hours, ticket.getVehicle().getVehicleType());

        ticket.closeTicket(fee);
        ticket.getSpot().free();

        activeTickets.remove(ticketId);

        System.out.println("Vehicle Unparked.");
        System.out.println("Total Fee: ₹" + fee);
    }

    private SpotType mapVehicleToSpot(VehicleType type) {

        switch (type) {
            case MOTORCYCLE:
                return SpotType.SMALL;
            case CAR:
                return SpotType.MEDIUM;
            case BUS:
                return SpotType.LARGE;
            default:
                return SpotType.SMALL;
        }
    }
}