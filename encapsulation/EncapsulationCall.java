package encapsulation;

public class EncapsulationCall {
    public static void main(String[] args) {
        Encapsulation ob=new Encapsulation();
        ob.setName("Motaleb");
        ob.setAge(35);
        System.out.println("Name :"+ob.getName());
        System.out.println("Age :"+ob.getAge());
    }
}
