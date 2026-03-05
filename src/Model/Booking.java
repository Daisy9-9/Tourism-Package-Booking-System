package Model;

public class Booking {

    private final int bookingId;
    private final Customer customer;
    private final TourPackage tourPackage;
    private final Transportation transportation;
    private final TourGuide tourGuide;
    private final int numberOfPeople;
    private double totalPrice;

    public Booking(int bookingId, Customer customer, TourPackage tourPackage,
                   Transportation transportation, TourGuide tourGuide, int numberOfPeople) {

        this.bookingId = bookingId;
        this.customer = customer;
        this.tourPackage = tourPackage;
        this.transportation = transportation;
        this.tourGuide = tourGuide;
        this.numberOfPeople = numberOfPeople;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public TourGuide getTourGuide() {
        return tourGuide;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}