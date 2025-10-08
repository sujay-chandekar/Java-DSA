package arrays;
import java.util.*;
public class Array_basic{
    public static void main(String[] args){
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.print("Enter Number : ");
            int x = sc.nextInt();
            arr[i] = x;
        }
        for(int n: arr){
            System.out.print(n+" ");
        }
    }
}