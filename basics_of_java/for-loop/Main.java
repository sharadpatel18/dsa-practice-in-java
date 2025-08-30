import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
            System.out.println(i);
        }

        System.err.println(numbers);

        for (Object elem : numbers) {
            System.err.println(elem);
        }
    }
}