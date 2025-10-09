package arrays;
import java.util.*;
public class Prime_InRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int m = sc.nextInt();

        if(n>m){
            System.out.println(("Invalid Input"));
            return;
        }
        int arr[] = new int[m-n];
        int k = 0;
        for(int i=n;i<=m;i++){
            int flag = 1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                arr[k++] = i;
            }
        }
        //printing in ',' pattern eg = range(2,22)  : 2,3,5,7,11,13,17,19
        for(int i=0;i<k;i++){
            if(i==k-1)
                System.out.print(arr[i]);
            else
            System.out.print(arr[i]+",");
        }
    }
}
