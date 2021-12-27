package static_variable;

public class ObjectCount {
    static  int count=0;

    ObjectCount(){
        count++;
    }

    void displayInformation(){
        System.out.println("Object Count="+count);
    }
}
