package super_class;

public class B extends A{
    int x=5;

    void display(){
        System.out.println("Value of Supper class ="+super.x);
        System.out.println("Value of sub class ="+x);
    }
}
