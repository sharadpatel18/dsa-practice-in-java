import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> lists = new ArrayList<Integer>();
        lists.ensureCapacity(100);

        for (int i = 0; i < 10; i++) {
            lists.add(i);
        }

        while (lists.size() > 0
        ) {
            System.out.println(lists.get(0));
            lists.remove(0);
        }

    }
}