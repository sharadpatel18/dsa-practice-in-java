import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> carName = new ArrayList<String>();
        
        carName.add("Volvo");
        carName.add("BMW");
        carName.add("Ford");
        carName.add("Mazda");
        
        System.out.println(carName);

        ArrayList<String> brandName = new ArrayList<String>();

        brandName.add("BMW");
        brandName.add("audi");
        brandName.add("volvo");

        System.err.println(brandName);

        ArrayList<String> combine = (ArrayList)carName.clone();
        combine.addAll(brandName);
        System.out.println(combine);

        ArrayList<String> combineString = new ArrayList<String>();
        combineString.addAll(carName);
        combineString.addAll(brandName);
        System.out.println(combineString);

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // list.ensureCapacity(10);

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.err.println(list);

    }
}