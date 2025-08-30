public class Main {
    public static void main(String[] args) {
        int marks = 68;

        if(marks >= 90){
            System.out.print("A");
        }else if(marks >= 70 && marks < 90){
            System.out.print("B");
        }else if(marks >= 50 && marks < 70){
            System.out.print("C");
        }else if(marks >=35 && marks < 50){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}