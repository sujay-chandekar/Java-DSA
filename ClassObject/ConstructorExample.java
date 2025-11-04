package ClassObject;

public class ConstructorExample {
    public static void main(String[] args) {
        Animal ani = new Animal("Tommy", 12);
        ani.get();
    }
}
class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    void get(){
        System.out.println("My name is : "+this.name+" and age is "+this.age);
    }
}