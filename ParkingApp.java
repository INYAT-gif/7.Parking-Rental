package se.inyat;
import java.util.List;
// Main class to demonstrate usage

public class ParkingApp {
    public static void main(String[] args) {
        // Create a ParkingSpaceManager instance
        ParkingSpaceManager manager = new ParkingSpaceManager();

        // Add some parking spaces
        manager.addParkingSpace(new ParkingSpace(1, "A1"));
        manager.addParkingSpace(new ParkingSpace(2, "B1"));
        manager.addParkingSpace(new ParkingSpace(3, "C1"));

        // List available parking spaces
        List<ParkingSpace> availableSpaces = manager.listAvailableSpaces();
        System.out.println("Available Parking Spaces:");
        for (ParkingSpace space : availableSpaces) {
            System.out.println("ID: " + space.getId() + ", Location: " + space.getLocation());
        }
    }
}
