package Homeworkweek6Mansi;
/* . Write a Java program to convert a decimal number to binary number*/

import java.util.Scanner;

public class P17BinaryNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number to convert into binary:");
        int x = scan.nextInt();
        System.out.println(Integer.toBinaryString(x));

        scan.close();
    }
}




