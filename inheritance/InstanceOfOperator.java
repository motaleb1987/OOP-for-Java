package inheritance;

public class InstanceOfOperator {
    public static void main(String[] args) {

        // Inheritance Check..
        Animal a=new Animal();
        Person p=new Person();
        Teachers t=new Teachers();

        System.out.println(a instanceof Animal);
        System.out.println(p instanceof Animal);
        System.out.println(t instanceof Person);
        System.out.println(t instanceof Animal);
        System.out.println(p instanceof Teachers);
    }
}
