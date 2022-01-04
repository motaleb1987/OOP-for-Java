package polymorphism2;

public class Test {
    public static void main(String[] args) {
        //Shape s=new Shape();
        //Rectangle r=new Rectangle(10,12);
        //Triangle t=new Triangle(10,15);

        //System.out.println(s.area());
        //System.out.println(r.area());
        //System.out.println(t.area());

        // Others way (Dynamic despatch)

        Shape[] s=new Shape[3];


        s[0]=new Shape();
        s[1]=new Rectangle(10,12);
        s[2]=new Triangle(10,15);
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());
        }




    }
}
