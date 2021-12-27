package overloading_constructor;

public class Teachers {
    String name, gender;
    int mobile;

    Teachers(){
        System.out.println("There is no values..");
    }

    Teachers(String n, String g){
        name=n;
        gender=g;
    }

    Teachers(String n,String g,int mob){
        name=n;
        gender=g;
        mobile=mob;
    }

    void displayInformation(){
        System.out.println("Name ="+name);
        System.out.println("Name ="+gender);
        System.out.println("Name ="+mobile);
        System.out.println("\n");
    }

}
