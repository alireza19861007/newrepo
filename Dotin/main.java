package Dotin;

public class main {
    public static <string> void main(String[] args) {
        int factorial = f(5);
        System.out.println( " result: " + factorial);

    }
    public static Integer f(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }
}
