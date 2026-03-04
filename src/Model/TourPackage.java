package Model;

public class TourPackage {
    private  int packageId;
    private String packageName;
    private String destination;
    private double pricePerPerson;
    private  int durationDays;



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
