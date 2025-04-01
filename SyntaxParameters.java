import java.util.*;

public class SyntaxParameters {
    // public static void calculateSum() {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println(("sum is :" + sum));
    // }

    // public static void calculateSum(int num1, int num2) {
    // int sum = num1 + num2;
    // System.out.println("sum is : " + sum);
    // }

    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // calculateSum(a, b);
        int sum = calculateSum(a, b);
        System.out.println("sum is : " + sum);
    }
}
