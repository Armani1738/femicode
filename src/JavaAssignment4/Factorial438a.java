package JavaAssignment4;

import java.util.Scanner;

public class Factorial438a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println(result);
    }
    public static int factorial(int number) {
        if (number < 0) {
            System.out.println("number can not be less than zero");
            return 1;
        } else {
            int factor = 1;
            for (int index = number; index > 0; index--) {
                factor = factor * (index);
            }
            return factor;
        }
    }
}
