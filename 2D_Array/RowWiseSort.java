import java.util.Arrays;
import java.util.Scanner;

public class RowWiseSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               arr[i][j] = sc.nextInt(); 
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            Arrays.sort(arr[i]);
        }
        System.out.println("Row wise sort : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
