public class Polymorphism_Runtime {
    public static void main(String[] args) {
        Dog d = new Puppy();
        d.eat();
    } 
}

class Dog{
    void eat(){
        System.out.println("Dog is eating ............");
    }
}

class Puppy extends Dog{
    void eat(){
        System.out.println("Puppy is eating .........");
    }
}