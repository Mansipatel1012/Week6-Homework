package Homeworkweek6Mansi;
/** Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;

public class P7TempretureValue {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        float fahrenheit = in.nextFloat();
        float celsius = ((fahrenheit - 32) * 5/9);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

          in.close();
    }
    }


