package ClassObject;

public class ClassObject {
    public static void main(String[] args) {
        Vehical obj = new Vehical();
        obj.start();
        obj.color = "Red";
        obj.getColor();
    }
}

class Vehical{
    String color;
    void start(){
        System.out.println("Car is Starting.....");
    }
    void getColor(){
        System.out.println("Color is : "+color);
    }
}