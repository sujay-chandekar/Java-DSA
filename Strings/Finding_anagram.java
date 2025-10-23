package Strings;
// 2. Check if Two Strings Are Anagrams

import java.util.*;
// Two strings are anagrams if they contain the same characters in a different order.
// Input: "listen", "silent"
// Output: true
public class Finding_anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag = true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
