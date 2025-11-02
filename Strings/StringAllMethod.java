import java.util.*;
import java.lang.*;
class StringAllMethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Hello";
        System.out.println("To Upper Case : "+str1.toUpperCase());
        System.out.println("To Lower Case : "+str1.toLowerCase());
        str1 = "   Hello   ";
        System.out.println("Before Trim : "+str1);
        str1 = str1.trim();
        System.err.println("After Trim : "+str1);
        System.out.println("StartWith : "+str1.startsWith("hh"));
        System.out.println("EndsWith : "+str1.endsWith("lo"));
        String str2 = new String("Hello");
        System.out.println("Comparison : "+str1==str2);
        System.out.println("Comparision with equals to : "+str1.equals(str2));
        str2=str2.toUpperCase();
        System.out.println("Equals Ignoring case : "+str1.equalsIgnoreCase(str2));
        int num = 123;
        String str3 = String.valueOf(num);
        System.out.println("Interger to string : "+str3);
        int x = Integer.parseInt(str3);
        System.out.println(x+11);
        str1="hello world";
        System.out.println("Replacing world with java : "+str1.replace("world","java"));
        System.out.println("Check Contains : "+str1.contains("rl"));
        System.out.println("SubString in String : "+str1.substring(1, 5));
        System.out.println("Split Method : ");
        String arr[] = str1.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        char chArr[] = str1.toCharArray();
        for(int i=0;i<chArr.length;i++){
            System.out.print(chArr[i]+" ");
        }
        str3="";
        System.out.println();
        System.out.println("Checking isEmpty : "+str3.isEmpty());
        System.out.println("getting index of charactor : "+str1.indexOf('o'));
        System.out.println("Replace all : "+str1.replaceAll("[aeiou]","*"));
        System.out.println("Maches method : "+str1.matches("[hell]"));
    }
}