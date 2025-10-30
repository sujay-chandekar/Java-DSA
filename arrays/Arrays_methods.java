package arrays;

import java.util.Arrays;

class Arrays_methods{
    public static void main(String[] args) {
        int arr1[] = {1,2,69,7,89,5};
        int arr2[] = {1,2,3};
        System.out.println("Arrays equal method: "+ Arrays.equals(arr1,arr2));
        System.out.println("Arrays compare method: "+ Arrays.compare(arr1,arr2));
        System.out.println("Arrays Sort: ");
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        String str = Arrays.toString(arr1);
        System.out.println("\nArrays to String: "+str);
    }
}