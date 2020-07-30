/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jul-20
 *  Time: 10:36 AM
 */

/*
Create add method which accept 2 int arguments,
 create another method with same name, which accept 2 double arguments.
 to demonstrate method overloading
 */

public class MethodOverLoadingDemo {
    public static void main(String[] args) {
        MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
        System.out.println(obj.add(12, 13.5));
        System.out.println(obj.add(12.2, 34));
    }

    public int add(int no1, int no2) {
        System.out.println("integer arguments");
        int response = 0;
        response = no1 + no2;
        return response;
    }

    public double add(double no1, double no2) {
        System.out.println("double arguments");
        double response = 0.0;
        response = no1 + no2;
        return response;
    }
}
