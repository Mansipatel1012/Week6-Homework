package Homeworkweek6Mansi;

/*4. Write a Java programme using the following steps.

    4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme

 */
public class P4InstanceAndStatic {
    static String a = "london";
    static String b = " Dubai";
    String x = "Watford";
    String y = " corby";

    public static void main(String[] args) {           // one main method
        myCity();
        P4InstanceAndStatic obj = new P4InstanceAndStatic();
        obj.myvillage();
    }
        // one static method:
    public static void myCity() {
        System.out.println(a + b);
        P4InstanceAndStatic obj = new P4InstanceAndStatic();
        System.out.println(obj.x + obj.y);

    }
         // one instance method:
    public void myvillage() {
        System.out.println(x + y);
        System.out.println(a + b);

    }
}
