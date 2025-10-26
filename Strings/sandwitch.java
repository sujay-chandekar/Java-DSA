package Strings;

import java.util.Scanner;

public class sandwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String ans = str.replaceAll("bread","");
        String finalans = ans.replaceAll("daerd","");
        System.out.println(finalans);
    }
}
