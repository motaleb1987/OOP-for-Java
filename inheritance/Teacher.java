package inheritance;

public class Teacher extends Person {
    //variable: name, age & Method: displayInformation already exits of this class.
    String qualifications;


    void displayInformation2() {
       displayInformation();
        System.out.println("Qualification ="+qualifications);
    }
}