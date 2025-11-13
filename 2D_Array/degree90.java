import java.util.*;

public class degree90 {
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
        System.out.println("After 90 degree");
        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
