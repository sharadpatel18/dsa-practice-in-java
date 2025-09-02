public class Main {
    static int originalNumber = 4554;
    static int number = originalNumber;
    static int reverse = 0;
    public static void main(String[] args) {
        while(number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;   
            number /= 10;
        }
        if (originalNumber == reverse) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not palindrome");
        }
    }
}