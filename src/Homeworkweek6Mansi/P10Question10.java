package Homeworkweek6Mansi;

/* . Write a Java program that takes a number as input and prints its
multiplication table up to 10.*/


import java.util.Scanner;

public class P10Question10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number:");
        int num1 = in.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num1 + " X " + (i + 0) + " = " + (num1 * (i + 1)));

            in.close();
        }


    }
}