package effectiveJava;

public class staticFactoryMethods {
    public static void main(String[] args) {
        //implemetig named static factory methods
        Distance d1=Distance.fromKmtoMeters(3);
        Distance d2=Distance.fromMtrtoKm(4450);
        System.out.println(d1.getDistance());
        System.out.println(d2.getDistance());

    }
    
}


