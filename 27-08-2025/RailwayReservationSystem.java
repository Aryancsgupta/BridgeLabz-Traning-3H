import java.util.Scanner;
public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeats = 5;
        int bookedSeats = 0;
        int waitingList = 0;
        int fare = 0;
        System.out.println(" Railway Reservation");
        System.out.println("1. Express  (Fare: 500)");
        System.out.println("2. Superfast (Fare: 800)");
        System.out.println("3. vandebharat  (Fare: 1200)");
        System.out.print("Choose your train: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: fare = 500; System.out.println("You selected Express."); break;
            case 2: fare = 800; System.out.println("You selected Superfast."); break;
            case 3: fare = 1200; System.out.println("You selected vandebharat."); break;
            default: fare = 500; System.out.println("Invalid choice! Express selected by default.");
        }char moreBooking;
        do {
            if (bookedSeats < totalSeats) {
                System.out.print("Enter passenger name: ");
                String name = sc.next();
                bookedSeats++;
                System.out.println(" Ticket booked for " + name);
            } else {
                System.out.print("Seats full! Enter name for waiting list: ");
                String name = sc.next();
                waitingList++;
                System.out.println(" " + name +"waiting list");
            }System.out.print("Do you want to book more tickets? (y/n): ");
            moreBooking = sc.next().charAt(0);
        } while (moreBooking == 'y' || moreBooking == 'Y');
        System.out.println("\n--- Reservation Summary ---");
        System.out.println("Total Seats Booked: " + bookedSeats);
        System.out.println("Total Waiting List: " + waitingList);

        sc.close();
    }
}