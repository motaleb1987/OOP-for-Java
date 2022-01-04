package polymorphism2;

public class Triangle extends Shape{
    //area()
    double base;
    double height;

    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    double area(){
        System.out.print(" Area for Triangle :");
        return base*height*.5;
    }
}
