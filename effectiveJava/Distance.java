package effectiveJava;



public class Distance{
    private final double totaldistance;
    private  Distance(double d){
        this.totaldistance=d;
    }
    //named static factory methods
    public static  Distance fromKmtoMeters(double value){
    return new Distance(value*10000);
    }
    public static Distance fromMtrtoKm(double value){
        return new Distance((value/1000));
    }
    public double getDistance(){
        return totaldistance;
    }


}
