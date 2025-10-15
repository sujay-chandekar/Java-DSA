package arrays;


public class sort_array {
    public static void main(String[] args) {
        int arr[] = {4,6,2,8,4,9,2};
        int n = arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
    }
}
