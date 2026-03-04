package service;

public class BookingService {

    public double calculatePackageCost(double pricePerPerson, int people) {
        return pricePerPerson * people;
    }

    public double calculateDiscount(int people, double packageCost) {
        if (people >= 10) {
            return packageCost * 0.20;
        } else if (people >= 5) {
            return packageCost * 0.10;
        }
        return 0;
    }

    public double calculateGuideFee(double feePerDay, int days) {
        return feePerDay * days;
    }

    public double calculateTotal(double packageCost, double discount,
                                 double transportCost, double guideFee) {
        return (packageCost - discount) + transportCost + guideFee;
    }
}