package Model;

public class TourGuide {
    private int guideId;
    private String guideName;
    private double feePerDay;

    public TourGuide(int guideId,String guideName,double feePerDay){
        this.guideId =guideId;
        this.guideName  = guideName;
        this.feePerDay = feePerDay;
    }

    public double getFeePerDay() {
        return feePerDay;
    }
    public String getGuideName(){
        return guideName;
    }
}
