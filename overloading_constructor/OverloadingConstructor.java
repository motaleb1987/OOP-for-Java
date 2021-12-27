package overloading_constructor;

public class OverloadingConstructor {
    public static void main(String[] args) {
        Teachers teachers1=new Teachers();
        teachers1.displayInformation();


        Teachers teachers2=new Teachers("Motaleb Hossain","Male");
        teachers2.displayInformation();

        Teachers teachers3=new Teachers("Lucky","Female",35);
        teachers3.displayInformation();
    }
}
