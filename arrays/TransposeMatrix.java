package arrays;
import java.util.*;
// A matrix transpose is created by interchanging its rows and columns
/*Eg    1 2 3   00 01 02
        4 5 6   10 11 12
answer  1 4     00 01
        2 5     10 11
        3 6     20 21*/
public class TransposeMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int row = sc.nextInt();
        System.out.println("Enter the Columns : ");
        int col = sc.nextInt();

        int arr[][] =  new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before Transpose : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int new_arr[][] = new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                new_arr[j][i] = arr[i][j];
            }
        }
        System.out.println("After the Transpose: ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
               System.out.print(new_arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
