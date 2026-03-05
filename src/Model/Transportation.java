package Model;

public class Transportation {
    private final String transportType;
    private final double transportCost;


    public Transportation( int transportationId, String transportType,double transportCost){
        this.transportType = transportType;
        this.transportCost=transportCost;
    }

    public double getTransportCost() {

        return transportCost;
    }
    public String getTransportType(){

        return transportType;
    }
}
