package JavaAssignment4;

import java.util.Scanner;

public class Factorial438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        double answer = constant(number);
        double total = power(number);
        System.out.println(result);
        System.out.printf("%.10f",answer);
        System.out.printf("%.5f",total);
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
    public static double constant (int number) {
        double e = 1.0;
        int sum = 1;
        for (int index = number; index > 0; index--) {
            e = sum + ((double) 1 / factorial(number));
        }
        return e;
    }

    public static double power(int number){
        double e = 1.0;
        int power = 0;
        int sum = 1;
        for (int index = number; index > 0; index++){
            e = power * sum + ((double) 1) / factorial(number);
        }
        return e;
    }

}
//
