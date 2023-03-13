package Homeworkweek6Mansi;

import java.util.Scanner;
/*  Write a Java program to swap two variables.*/
public class P15SwapTwoVariable {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("input number 1:");
        int a = scanner.nextInt();
        System.out.println("input number 2:");
        int b= scanner.nextInt();
        System.out.println("before swaping = " + a + ";" +b);
        int ab;
        ab = a;
        a= b;
        b= ab;
        System.out.println("after swaping : " + a + ";" +b);

         scanner.close();

    }
}
