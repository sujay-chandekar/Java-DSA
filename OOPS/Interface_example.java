public class Interface_example {
    public static void main(String[] args) {
        College obj = new College();
        obj.subjects();
    }
}

interface University{
    public void subjects();
}

class College implements University{
    public void subjects(){
        System.out.println("Mathematics Physics Chemisty");
    }
}