import java.util.*;

public class JavaSet {
    public static void main(String[] args) {
        //HashSet --> unordered 
        //LinkedHashSet --> ordered
        //TreeSet --> Sorted
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(40);
        s.add(50);
        s.add(50);
        s.add(70);
        System.out.println(s);
        System.out.println(s.remove(30));
        System.out.println(s.contains(70));

        Set<Integer> ls = new LinkedHashSet<>();
        ls.add(10);
        ls.add(40);
        ls.add(50);
        ls.add(50);
        ls.add(70);
        System.out.println(ls);
        System.out.println(ls.remove(30));
        System.out.println(ls.contains(70));

        Set<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(40);
        ts.add(50);
        ts.add(50);
        ts.add(70);
        System.out.println(ts);
        System.out.println(ts.remove(30));
        System.out.println(ts.contains(70));
    }
}
