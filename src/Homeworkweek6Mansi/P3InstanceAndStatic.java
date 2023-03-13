package Homeworkweek6Mansi;

/* . Write a Java programme using the following steps.
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the
       print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.*/


public class P3InstanceAndStatic {
    static int a = 75;
    int b = 30;

    public static void main(String[] args) {
       myStaticMethod();
        P3InstanceAndStatic obj = new P3InstanceAndStatic();
        obj.myInstanceMethod();

    }
       // one static method:
    public static void myStaticMethod() {
        P3InstanceAndStatic obj = new P3InstanceAndStatic();
        System.out.println(a);
        System.out.println(obj.b);

    }
      // one instance method:
    public void myInstanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }
}
