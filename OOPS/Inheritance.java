
public class Inheritance {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.setData(180,"G80");
        System.out.println("Model "+obj.model+" has speed "+obj.speed+" km/h");
    }
}
class Vehical{
    int speed;
    void start(){
        System.out.println("Vehical is Starting .....");
    }
}

class Car extends Vehical{
    String model;
     void setData(int speed,String model){
        this.speed  =speed;
        this.model = model;
    }
}
