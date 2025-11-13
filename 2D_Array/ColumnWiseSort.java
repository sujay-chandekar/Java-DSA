import java.util.*;

public class ColumnWiseSort {
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
        int arr1[][] = new int[m][n];
        //Transpose
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = arr[j][i];
            }
        }
        for(int i=0;i<n;i++){
            Arrays.sort(arr1[i]);
        }
        //transpose
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = arr1[j][i];
            }
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
