import java.util.*;
class StringBuilder1{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World!");
        System.out.println("Append : "+sb);
        sb.insert(5," Java");
        System.out.println("Insert : "+sb);
        sb.replace(5,10," Python");
        System.out.println("replace : "+sb);
        sb.delete(5,12 );
        System.out.println("Delete : "+sb);
        sb.reverse();
        System.out.println("Reverse : "+sb);
        String s = sb.substring(5,sb.length());
        System.out.println("Sub String : "+s);
        

    }
}