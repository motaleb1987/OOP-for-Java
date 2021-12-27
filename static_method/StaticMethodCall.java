package static_method;

public class StaticMethodCall {
    public static void main(String[] args) {
        // Non Static Method Calling Systems [object create then object.method_name]
        StaticMethod ob1=new StaticMethod();
        ob1.display1();
        StaticMethod ob2=new StaticMethod();
        ob2.display3();

        //  Static Method Calling Systems [class_name.method_name]
        StaticMethod.display2();
        StaticMethod.display4();
    }
}
