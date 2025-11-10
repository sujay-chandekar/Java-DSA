public class Polymorphism_Complile {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        obj.add(2,3);
        obj.add(2,3,4);
    }
}
class MathOperation{
    void add(int x,int y){
        System.out.println("x+y : "+(x+y));
    }
    void add(int x,int y,int z){
        System.out.println("x+y+z : "+(x+y+z));
    }
}