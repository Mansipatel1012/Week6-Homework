package Homeworkweek6Mansi;
/* 2. Write a Java programme using the following steps.
    2.1 Declare two static variables
    2.2 Declare one static method
    2.3 Call both static variables into the static method inside the print statement.
    2.4 Declare the Main method.
    2.5 Call the static method into the Main method and Run the programme.

 */
public class P2StaticVariable {
    static int a = 20;
    static int b = 40;

    public static void main(String[] args) {
        myMethod();

    }

    //one static method
    public static void myMethod() {
        System.out.println(a);
        System.out.println(P2StaticVariable.b);

    }
}

