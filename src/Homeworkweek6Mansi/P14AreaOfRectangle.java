package Homeworkweek6Mansi;
/* . Write a Java program to print the area and perimeter of a rectangle*/


import java.util.Scanner;

public class P14AreaOfRectangle {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width = ");
        double w = scanner.nextDouble();
        System.out.println("Input Height = ");
        double h = scanner.nextDouble();
        System.out.println("Area is = " + w * h);
        System.out.println("perimeter is = "  + 2 *(w + h));

        scanner.close();
    }
}

