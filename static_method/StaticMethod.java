package static_method;

public class StaticMethod {
    String nonStaticval="Non Static Motaleb";
    static  String Staticval="Static Rashed vai";

    void display1(){
        System.out.println("I am Non Static Method display1");
    }



    static void display2(){
        System.out.println("I am Static Method..display2");
    }

    void display3(){
        System.out.println(nonStaticval);
        display1();
        System.out.println("I am Called to Non Static Method=display1");
    }



    static void display4(){
        System.out.println(Staticval);
        display2();
        System.out.println("I am Called to Static Method=display2");

    }

}
