import java.util.Collections;
import java.util.LinkedList;

class JavaLinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(10);
        li.add(80);
        li.add(30);
        li.add(60);
        li.add(50);
        System.out.println(li);
        System.out.println("Peek : "+li.peek());
        li.addLast(60);
        System.out.println(li);
        System.out.println("Printing the size of the list : "+li.size());
        System.out.println("Get First : "+li.getFirst());
        System.out.println("Get Last : "+li.getLast());
        System.out.println("Get By index : "+li.get(2));
        System.out.println("Check is empty or not : "+li.isEmpty());
        System.out.println("Poll element : ");

        System.out.println("poll from first : "+li.poll());

        System.out.println("poll from last : "+li.pollLast() );
        System.out.println("li : "+li);

        System.out.println("Converting list into array and printing : ");
        Object arr[] = li.toArray();
        for(Object i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nPrinting li in for each loop : ");
        for(Integer i:li){
            System.out.print(i+" ");
        }
        System.out.println("\nSort and print :");
        Collections.sort(li);
        System.out.println(li);

    }
}