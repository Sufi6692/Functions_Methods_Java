import java.awt.*;
import java.util.Scanner;

public  class Main  {
    public static void main(String[] args) {
        // Q: take input of 2 numbers and print the sum
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
       int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is :"+ sum);


    }
}