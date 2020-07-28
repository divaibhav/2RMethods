import java.util.Scanner;

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Jul-20
 *  Time: 5:31 PM
 */
/*
Create a method isEven(int no1), which accept one argument of type int and
return a boolean value true if no1 is even otherwise false.
*/
public class MethodDemoIsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int no1 = sc.nextInt();
        MethodDemoIsEven object = new MethodDemoIsEven();
        boolean result = object.isEven(no1);
        System.out.println("number is Even -- > " + result);
    }

    public boolean isEven(int no1) {
        boolean response = false;
        if (no1 % 2 == 0) {
            response = true;
        }
        return response;

    }
}
