package Homeworkweek6Mansi;

/* 5. Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.
 */
public class P5Calculator {
         //with parameter
    public static void main(String[] args) {// main method
        P5Calculator obj1 = new P5Calculator();
        substraction(20,5);
        Multiplication(15,10);
        obj1.addition(50,30);
        obj1.division(40,20);
    }
      //Two static two instant method:
    public static void substraction(int a ,int b) {
        int ans = a - b;
        System.out.println("substraction of two number is : " + ans); //String concatination
    }
    public static void Multiplication(int a ,int b) {
        int ans = a * b;
        System.out.println("Multiplication of two number is: " + ans);
    }
    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("addition of two numbers is :" + ans);
    }
    public void division(int a ,int b){
        int ans = a /b;
        System.out.println("division of two numbers is :" + ans);

    }
}
