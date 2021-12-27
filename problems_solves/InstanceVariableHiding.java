package problems_solves;

public class InstanceVariableHiding {
    double height,width,depth;

    InstanceVariableHiding(double height, double width, double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }

    void displayVol(){
        double vol=height*width*depth;
        System.out.println("Volume "+vol);
    }

    public static void main(String[] args) {
        InstanceVariableHiding box1=new InstanceVariableHiding(10,10,10);
        InstanceVariableHiding box2=new InstanceVariableHiding(20,30,10);

        box1.displayVol();
        box2.displayVol();
    }
}
