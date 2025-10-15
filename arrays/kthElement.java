package arrays;
import java.util.*;
public class kthElement {
    public static void main(String[] args) {
        //Finding kth smallest element
        int arr[] = {55,4,466,777,88,99,55,33,44,56};
        System.out.println("Enter the k:");
        Scanner sc  = new Scanner(System.in);
        int k = sc.nextInt();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[k-1]);
        sc.close();

    }
}
