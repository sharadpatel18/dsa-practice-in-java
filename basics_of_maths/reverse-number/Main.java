public class Main {
    static int number = 28934;
    static int reverse = 0;
    public static void main(String[] args) {
        while(number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;   
            number /= 10;
        }
       System.out.println(reverse);
    }
}