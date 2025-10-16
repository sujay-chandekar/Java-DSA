package arrays;

public class Move_negatives {
    public static void main(String[] args) {
        int arr[] = {2,5,-1,4,3,-1,5,9,-1,3,5};
        int n = arr.length;
        int i=0;
        int cnt=0;
        for(i=0;i<n;i++){
            if(arr[i]==-1) cnt++;
        }
        int new_arr[] = new int[n];
        int k = 0;
        for(i=0;i<n;i++){
            if(arr[i]!=-1){
                new_arr[k++] = arr[i];
            }
        }
        for(i=0;i<cnt;i++){
            new_arr[k++] = -1;
        }
        for(i=0;i<n;i++){
            System.out.print(new_arr[i]+" ");
        }
    }
}
