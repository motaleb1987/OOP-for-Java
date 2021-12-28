package auto_type_conversion;

import method_overloading.MethodOverLoading;

public class TypeConversion {

    public void add(double a, double b){
        System.out.println(a+b);
    }

    public void add(double a, double b,double c){ // floating data called from ob4 object
        System.out.println(a+b+c);
    }

    public void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public void add(){
        System.out.println("No added any values");
    }

    public static void main(String[] args) {
        TypeConversion ob2=new TypeConversion();
        TypeConversion ob3=new TypeConversion();
        TypeConversion ob4=new TypeConversion();

        // Note: No Converted/promoted double and boolean data type to ony others

        ob2.add(5,10); // automatic double type a convert hoiche.
        ob3.add(5,10,15);
        ob4.add(7.f,8.5,9.4);
        ob3.add();

    }
}
