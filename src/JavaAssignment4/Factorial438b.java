package JavaAssignment4;

import java.util.Scanner;

import static JavaAssignment4.Factorial438a.factorial;

public class Factorial438b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        double answer = constant(number);
        System.out.printf("%.10f", answer);
    }
    public static double constant (int number){
        double e = 1.0;
        int sum = 1;
        for (int index = number; index > 0; index--) {
            e = sum + ((double) 1 /factorial(number));
        }
        return e;
    }

}