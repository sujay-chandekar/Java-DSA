import java.util.Scanner;

public class DiagonalSum {
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
        int sum1= 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if(i==j){
                sum1+=arr[i][j];
               }
               if(i+j == n-1){
                sum2+=arr[i][j];
               }
            }
            System.out.println();
        }
        System.out.println("Sum1: "+sum1);
        System.out.print("Sum2 : "+sum2);
    }
}
