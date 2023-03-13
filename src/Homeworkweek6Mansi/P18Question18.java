package Homeworkweek6Mansi;
/*18. Write a Java program to print the sum (addition), multiply, subtract, divide and
        remainder of two numbers.

 */

import java.util.Scanner;

public class P18Question18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number 1 = ");
        int a = scanner.nextInt();
        System.out.println("input number 2 = ");
        int b = scanner.nextInt();

        System.out.println("125 + 24 = " + ( a + b));
        System.out.println("125-24 = " + (a - b));
        System.out.println("125 x 24 = " + (a * b));
        System.out.println("125/24 = " + (a/b));
        System.out.println("125 mod 24 = " + (a % b));

        }


    }

