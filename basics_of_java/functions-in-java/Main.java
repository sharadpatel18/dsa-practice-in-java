import java.util.*;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numberList.add(i);
        }

        AddValues(11, numberList);
        System.err.println(numberList);
    }

    public static void AddValues(int Value , ArrayList<Integer> numberList) {
        numberList.add(Value);
    }
}