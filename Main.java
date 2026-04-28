import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReservationSystem rs = new ReservationSystem();

        // Step 1: Assign capacity
        System.out.print("Enter total number of seats: ");
        int capacity = sc.nextInt();
        rs.setCapacity(capacity);

        // Step 2: Allow seat booking
        while (true) {
            System.out.print("Enter seat number to book (0 to exit): ");
            int seat = sc.nextInt();
            if (seat == 0) break;
            rs.bookSeat(seat);
        }

        // Step 3: Display final seating status
        rs.displaySeats();
        sc.close();
    }
}