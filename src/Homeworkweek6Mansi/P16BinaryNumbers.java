package Homeworkweek6Mansi;
/* . Write a Java program to add two binary numbers.*/

import java.util.Scanner;

public class P16BinaryNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st binary number:");
        String a = scanner.next();
        System.out.println("please enter 2nd binary number:");
        String b = scanner.next();
        int n1 = Integer.parseInt(a,2);
        int n2 = Integer.parseInt(b, 2);
        int n3 = n1+n2;

        System.out.println("n3=n1+n2: " + Integer.toBinaryString(n3));

        scanner.close();


    }
}
