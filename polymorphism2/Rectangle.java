package polymorphism2;

public class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    double area(){
        System.out.print(" Area for Rectangle :");
        return length*width;
    }

}
