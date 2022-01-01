package method_overriding;

public class MethodOverringCall {
    public static void main(String[] args) {
        Person person=new Person();
        Teachers teachers=new Teachers();

        person.name="Muhin Khan";
        person.age=33;
        person.displayInformation();

        System.out.println("\n");
        teachers.name="Motaleb Hossain";
        teachers.age=35;
        teachers.qualification="Bsc in Engg";

        teachers.displayInformation();

    }
}
