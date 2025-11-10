public class AbstarctClass {
    public static void main(String[] args) {
        Human obj  =new Men();
        obj.walk();
        InnerAbstarctClass obj1 = new abstractExample();
        obj1.printVal(450);
    }
}

abstract class Human{
    abstract void walk();
}

class Men extends Human{
    @Override
    void walk(){
        System.out.println("Men is Walking.....");
    }
}

interface InnerAbstarctClass {

    public void printVal(int x);
    
}

class abstractExample implements InnerAbstarctClass{
    @override
    public void printVal(int x){
        System.out.println("Value : "+x);
    }
}