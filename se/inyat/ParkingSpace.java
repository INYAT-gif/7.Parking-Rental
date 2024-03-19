package se.inyat;
// Define a class to represent a Parking Space
class ParkingSpacw {
    private int id;
    private String location;
    private boolean available;

    // Constructor
    public void ParkingSpace(int id, String location) {
        this.id = id;
        this.location = location;
        this.available = true; // By default, a parking space is available
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setter method to update availability
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

