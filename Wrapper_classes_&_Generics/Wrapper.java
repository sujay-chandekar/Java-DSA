public class Wrapper{
    public static void main(String[] args) {
        int i = 120;
        Integer obj = Integer.valueOf("1233");
        System.out.println("Object value is : "+obj);
        int j = obj;
        System.out.println("Object to int value is : "+(j+123));
    }
}