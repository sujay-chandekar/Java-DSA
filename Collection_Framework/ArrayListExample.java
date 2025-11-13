import java.util.*;
import java.util.ArrayList;
class ArrayListExample{
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        System.out.println("Size of the list : "+li.size());
        System.out.println("Element of the list : ");
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println();
        for(Integer i:li){
            System.out.print(i+" ");
        }
        System.out.println();
        li.remove(3);
        System.out.println(li);
        
        //contains 
        System.out.println("Contains :"+li.contains(10));
        //contains all
        List<Integer> l2 = new ArrayList<>();
        l2.add(20);
        l2.add(60);
        System.out.println("Contains all :"+li.containsAll(l2));

        System.out.println("Index Of 20 :"+li.indexOf(20));
        System.out.println("isEmpty() : "+li.isEmpty());
        li.removeAll(l2);
        System.out.println("After remove all : "+li);

        li.add(20);
        li.retainAll(l2);
        System.out.println("li : "+li);
        System.out.println("l2 : "+l2);
        System.out.println("Retain All : "+li);

    }
}