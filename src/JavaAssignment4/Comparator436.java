package JavaAssignment4;

import java.util.Scanner;

public class Comparator436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the firstNumber : ");
        int number = scanner.nextInt();
        System.out.println("Enter the secondNumber: ");
        int number1 = scanner.nextInt();

        if(number > number1){
            System.out.printf("The FirstNumber is Greater than the SecondNumber: 1 ");
        }
        else if(number1 > number){
            System.out.printf("The SecondNumber is Greater than the FirstNumber: -1");
        }
        else{
            System.out.printf("The FirstNumber and SecondNumber are Equal: 0 ");
        }
    }
}
