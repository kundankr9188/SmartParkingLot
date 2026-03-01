import enums.*;
import model.*;
import service.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ParkingSpot s1 = new ParkingSpot("S1", SpotType.SMALL);
        ParkingSpot s2 = new ParkingSpot("S2", SpotType.MEDIUM);
        ParkingSpot s3 = new ParkingSpot("S3", SpotType.LARGE);

        ParkingFloor floor1 = new ParkingFloor(1, Arrays.asList(s1, s2, s3));

        ParkingLot parkingLot = new ParkingLot(Arrays.asList(floor1));

        ParkingService service = new ParkingService(parkingLot);

        Vehicle car = new Vehicle("KA01AB1234", VehicleType.CAR);

        Ticket ticket = service.parkVehicle(car);

        Thread.sleep(2000); // simulate parking time

        if (ticket != null) {
            service.unparkVehicle(ticket.getTicketId());
        }
    }
}