import java.util.Arrays;

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jul-20
 *  Time: 10:50 AM
 */
//adding all the elements of arr by using add method
public class MethodCallByReference {
    public static void main(String[] args) {
        int[] brr = {10, 20, 30, 40};
        MethodCallByReference obj = new MethodCallByReference();
        System.out.println(obj.add(brr));
        System.out.println("brr -->" + Arrays.toString(brr));
    }

    public int add(int[] arr) {
        int response = 0;
        for (int i = 0; i < arr.length; i++) {
            response = response + arr[i];
            arr[i] = 0;
        }
        return response;
    }
}
