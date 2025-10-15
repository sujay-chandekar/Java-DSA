package arrays;

public class reverse_array {
    public static void main(String[] args) {
        int arr[] = {2,2,4,5,6,7,8,9};
        int n = arr.length;
        int i = 0,j=n-1;
        while(i<j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
