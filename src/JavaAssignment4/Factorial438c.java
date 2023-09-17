package JavaAssignment4;

import java.util.Scanner;

import static JavaAssignment4.Factorial438a.factorial;

public class Factorial438c {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        double total = power(number);
        System.out.printf("%.5f",total);
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