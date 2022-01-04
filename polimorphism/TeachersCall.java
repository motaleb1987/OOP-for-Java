package polimorphism;

public class TeachersCall {
    public static void main(String[] args) {
        // Run time polymorphism
        Person p=new Person();
        p.displayInformation();

        p=new Students();
        p.displayInformation();

        p=new Teachers();
        p.displayInformation();


    }
}
