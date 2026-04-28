import java.util.Scanner;

class ReservationSystem {
    private int totalSeats;
    private boolean[] seats;

    // Constructor - initializes variables
    public ReservationSystem() {
        this.totalSeats = 0;
        this.seats = new boolean[0];
    }

    // Method to assign capacity
    public void setCapacity(int capacity) {
        this.totalSeats = capacity;
        this.seats = new boolean[capacity]; // all seats are initially false (unbooked)
        System.out.println("Vehicle capacity set to " + capacity + " seats.");
    }

    // Method to assign (book) seats
    public void bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > totalSeats) {
            System.out.println("Invalid seat number.");
        } else if (seats[seatNumber - 1]) {
            System.out.println("Seat " + seatNumber + " is already booked.");
        } else {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " booked successfully!");
        }
    }

    // Method to display all seat status
    public void displaySeats() {
        System.out.println("Seat Status:");
        for (int i = 0; i < totalSeats; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Booked" : "Available"));
        }
    }
}
