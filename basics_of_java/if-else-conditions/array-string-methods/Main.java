import java.util.*;

public  class Main {
    public static void main(String[] args){
        String line = "Sharad is developer";

        System.err.println(line.length());
        System.err.println(line.charAt(0));
        System.err.println(line.substring(0, 5));
        System.err.println(line.toUpperCase());
        System.err.println(line.toLowerCase());
        // equels , equelsIgnoreCase and contains indexOf and lastIndexOf , trim , replace and split and isEmpty

        // for arrays

        String[] arr_Strings = {"sharad" , "is" , "developer" };

        Arrays.sort(arr_Strings);
        Arrays.fill(arr_Strings, ".");
        System.err.println(arr_Strings.length);

    }
}