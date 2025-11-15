import java.util.*;
public class JavaMap {
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"one");
        mp.put(2,"two");
        mp.put(3,"three");
        mp.put(4,"four");

        System.out.println(mp);

        System.out.println("If Present then push do not override : ");
        mp.putIfAbsent(3, "Five");

        System.out.println(mp);
        System.out.println("get Method : "+mp.get(3));
        System.out.println("Contains Key : "+mp.containsKey(4));
        System.out.println("Contains Value : "+mp.containsValue("two"));

        //removes
        mp.remove(2);
        System.out.println("After the removing : "+mp);
        Collection<Integer> keys = mp.keySet();
        System.out.println(keys);


        Collection<String> value = mp.values();
        System.out.println(value);

        System.out.println("Entry Set : ");
        Set<Map.Entry<Integer,String>> enties = mp.entrySet();
        for(Map.Entry<Integer,String> e : enties){
            System.out.println(e);
        }
    }
}
