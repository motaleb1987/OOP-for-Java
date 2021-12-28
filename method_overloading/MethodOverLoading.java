package method_overloading;

public class MethodOverLoading {
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(double a, double b){
        System.out.println(a+b);
    }

    public void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public void add(){
        System.out.println("No added any values");
    }

    public static void main(String[] args) {
        MethodOverLoading ob1=new MethodOverLoading();
        MethodOverLoading ob2=new MethodOverLoading();
        MethodOverLoading ob3=new MethodOverLoading();
        MethodOverLoading ob4=new MethodOverLoading();

        ob1.add(5,10);
        ob2.add(5.5,10.5);
        ob3.add(5,10,15);
        ob3.add();

    }

}
