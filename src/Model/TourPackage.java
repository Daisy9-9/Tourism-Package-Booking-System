package Model;

public class TourPackage {
    private final int packageId;
    private final String packageName;
    private final String destination;
    private final double pricePerPerson;
    private final int durationDays;



    public TourPackage(int packageId,String packageName,String destination, double pricePerPerson,int durationDays){
        this.packageId = packageId;
        this.packageName = packageName;
        this.destination = destination;
        this.pricePerPerson = pricePerPerson;
        this.durationDays =durationDays;
    }
    public double getPricePerPerson(){
        return pricePerPerson;
    }
    public int getDurationDays(){
        return durationDays;
    }
    public String getPackageName(){
        return packageName;
    }
    public  String getDestination(){
        return destination;
    }


}
