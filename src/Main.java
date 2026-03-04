import java.util.Scanner;

import Model.*;
//import model.*;
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

        // Create sample package
        TourPackage tourPackage = new TourPackage(
                1, "Siem Reap Tour", "Siem Reap", 120, 3);

        // Create sample transport
        Transportation transport = new Transportation(
                1, "Bus", 200);

        // Create sample guide
        TourGuide guide = new TourGuide(
                1, "Mr. Dara", 50);

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


        System.out.println("\n=== Booking Summary ===");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Package: " + tourPackage.getPackageName());
        System.out.println("Destination: " + tourPackage.getDestination());
        System.out.println("People: " + people);
        System.out.println("Package Cost: $" + packageCost);
        System.out.println("Discount: $" + discount);
        System.out.println("Transport Cost: $" + transport.getTransportCost());
        System.out.println("Guide Fee: $" + guideFee);
        System.out.println("Total Price: $" + booking.getTotalPrice());

        sc.close();
    }
}