package method_call;

import java.util.Scanner;

public class MethodRun {
    public static void main(String[] args) {
        int val;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Integer Value: ");
        int result=input.nextInt();
        MethodCall methodCall=new MethodCall();
        System.out.println("Square of "+result+"= "+ methodCall.square(result));

    }
}
