public class Generics {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog("Gtt23");
        Dog<Integer> d2 = new Dog(123);
        d1.display("d1");
        d2.display(d2.toString());


    }
}

class Dog <C>{
    C id;
    public Dog(C id){
        this.id = id;
    }
    <T> void display(T name){
        System.out.println(id+" of this is from "+name);
    }
}
