package Strings;
// 1. Reverse Each Word in a Sentence
// Input: "Java is awesome"
// Output: "avaJ si emosewa"
import java.util.*;

public class Reverse_each_word {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder s = new StringBuilder(arr[i]);
            s.reverse();
            System.out.print(s+" ");
        }
    }

}
