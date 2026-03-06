import java.util.Scanner;
//import model.*;
import Model.*;
import service.BookingService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookingService service = new BookingService();

        System.out.println("=== Tourism Booking System ===");

        // Customer input
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone: ");
        String phone = sc.nextLine();

        Customer customer = new Customer(1, name, phone);

        // Tour menu
        System.out.println("\nChoose a tour package:");
        System.out.println("1. Siem Reap Tour - $100 per person (3 days)");
        System.out.println("2. Phnom Penh City Tour - $50 per person (2 days)");
        System.out.println("3. Kampot Tour - $90 per person (2 days)");
        System.out.println("4. Kep Beach Tour - $80 per person (2 days)");
        System.out.println("5. Mondulkiri Adventure - $150 per person (4 days)");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        TourPackage tourPackage = null;

        switch (choice) {
            case 1:
                tourPackage = new TourPackage(1,"Siem Reap Tour","Siem Reap",100,3);
                break;

            case 2:
                tourPackage = new TourPackage(2,"Phnom Penh City Tour","Phnom Penh",50,2);
                break;

            case 3:
                tourPackage = new TourPackage(3,"Kampot Tour","Kampot",90,2);
                break;

            case 4:
                tourPackage = new TourPackage(4,"Kep Beach Tour","Kep",80,2);
                break;

            case 5:
                tourPackage = new TourPackage(5,"Mondulkiri Adventure","Mondulkiri",150,4);
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Transportation menu
        System.out.println("\nChoose transportation:");
        System.out.println("1. Bus - $15");
        System.out.println("2. Van - $25");
        System.out.println("3. Private Car - $45");

        System.out.print("Enter transportation choice: ");
        int transportChoice = sc.nextInt();

        Transportation transport = null;

        switch (transportChoice) {
            case 1:
                transport = new Transportation(1,"Bus",15);
                break;

            case 2:
                transport = new Transportation(2,"Van",25);
                break;

            case 3:
                transport = new Transportation(3,"Private Car",45);
                break;

            default:
                System.out.println("Invalid transportation choice!");
                return;
        }

        // Tour Guide
        TourGuide guide = new TourGuide(1,"Mr. Dara",10);

        // Number of people
        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        Booking booking = new Booking(
                1, customer, tourPackage, transport, guide, people);

        // Calculations
        double packageCost = service.calculatePackageCost(
                tourPackage.getPricePerPerson(), people);

        double discount = service.calculateDiscount(people, packageCost);

        double guideFee = service.calculateGuideFee(
                guide.getFeePerDay(), tourPackage.getDurationDays());

        double total = service.calculateTotal(
                packageCost, discount,
                transport.getTransportCost(), guideFee);

        booking.setTotalPrice(total);

        // Output
        System.out.println("\n=== Booking Summary ===");
        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("\n========Customer Information======");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Customer Phone :" +customer.getPhone());

        System.out.println("\n========Trip Details======");
        System.out.println("Destination: " + tourPackage.getDestination());
        System.out.println("Package: " + tourPackage.getPackageName());
        System.out.println("People: " + people);
        System.out.println("TransportationType :"+transport.getTransportType());
        System.out.println("Tour Guide :"+guide.getGuideName());

        System.out.println("\n========Payment Summary======");
        System.out.println("Package Cost: $" + packageCost);
        System.out.println("Transport Cost: $" + transport.getTransportCost());
        System.out.println("Guide Fee: $" + guideFee);
        System.out.println("Discount: $" + discount);

        System.out.println("\n=============================");

        System.out.println("Total Price: $" + booking.getTotalPrice());
        System.out.println("\n=============================");



        sc.close();
    }
}