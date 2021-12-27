package static_variable;

public class Students {
    String name;
    int id;
    static String universityName="Mawlana Bashani Science and Technology University";

    Students(String n, int i){
        name=n;
        id=i;
    }

    void displayInformation(){
        System.out.println("Name ="+name);
        System.out.println("Name ="+id);
        System.out.println("University ="+universityName);
        System.out.println("\n");
    }

}
