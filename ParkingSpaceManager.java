package se.inyat;
import se.inyat.ParkingSpace;

import java.util.ArrayList;
import java.util.List;

// Define a class to manage Parking Spaces
class ParkingSpaceManager {
    private List<ParkingSpace> spaces;

    // Constructor
    public ParkingSpaceManager() {
        this.spaces = new ArrayList<>();
    }

    // Method to add a new parking space
    public void addParkingSpace(ParkingSpace space) {
        spaces.add(space);
    }

    // Method to list available parking spaces
    public List<ParkingSpace> listAvailableSpaces() {
        List<ParkingSpace> availableSpaces = new ArrayList<>();
        for (ParkingSpace space : spaces) {
            if (space.isAvailable()) {
                availableSpaces.add(space);
            }
        }
        return availableSpaces;
    }
}

