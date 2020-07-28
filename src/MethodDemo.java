/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Jul-20
 *  Time: 5:04 PM
 */
/*
Create a method called display(),
this method will print hello world and will not return any value.
 */

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("method demo starts");
        //creating object to call display method
        MethodDemo object = new MethodDemo();
        // calling display method
        object.display();

        System.out.println("exiting...");

    }

    //declaring and defining display method
    public void display() {
        System.out.println("Hello World");
        return;// transferring control from display to main, as main is the calling method

    }
}
