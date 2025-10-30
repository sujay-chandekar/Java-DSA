package Strings;

public class String_Methods {
    public static void main(String[] args) {
        String str = "hel*lo*jhfb*fhd*hdb";
        System.out.println("String length: "+str.length());
        System.out.println("String CharAt: "+str.charAt(1));
        System.out.println("String SubString: "+ str.substring(1,7));
        String arr[] = str.split("[*]");
        System.out.println("Splitted String in array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //String to int 
        String n = "123";
        int n1 = Integer.parseInt(n);
        System.out.println("\nString to Integer: "+n1);
        String n2=  Integer.toString(n1);
        System.out.println("Int to String : "+n2);
        String str2 = "hel";
        System.out.println("String contains : "+str.contains(str2));
    }
}
