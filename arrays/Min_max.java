package arrays;
public class Min_max {
    public static void main(String[] args) {
        int []arr = {18,2,3,5,33,63,79,10};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximun value is : "+max);
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value is : "+min);
        }
}