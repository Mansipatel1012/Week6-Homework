package Homeworkweek6Mansi;

import java.util.Scanner;

/*6. Write a program to enter any radius value of the circle and find out the
        area.(Formula of Area A=PI*r*r).

 */
public class P6RadiusOfCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius = 0.0;
        // prompt the user to enter the radius
        System.out.println("Enter the radius of circle :");
        //nextDouble method reads user input and assign it to radius
        // variable
        radius = scanner.nextDouble();
        // Area of circle
        double area = 0.0;
        // circumference of circle
        double circumfrence = 0.0;
        System.out.println("Radius entered by user : " + radius);
         // area of circle  = 22/7 * radius * radius
        area = Math.PI * radius * radius;
        System.out.println("Area of circle is:" + area);
        //circumference  = 2  * Math. PI * radius;

        scanner.close();

    }

}
