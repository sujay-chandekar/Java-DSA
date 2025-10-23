package Strings;
// 3. Count Frequency of Each Character

import java.util.Scanner;

// Input: "programming"
public class Count_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            int x = (int)s.charAt(i);
            arr[x-97] +=1;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                char c = (char)(97+i);
                System.out.println(c+" "+arr[i]);
            }

        }
    }
}
