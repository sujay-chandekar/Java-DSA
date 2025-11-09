
public class OverrrideMethod {
    public static void main(String[] args) {
        Car obj = new Car();
    }
}

class Vehical{
    Vehical(){
        System.out.println("Vehical Constructor");
    }
    void start(){
        System.out.println("Vehical Starting ......");
    }
}

//Super keyword
class Car extends Vehical{
    Car(){
        System.out.println("Car Constructor");
        super.start();
    }
}