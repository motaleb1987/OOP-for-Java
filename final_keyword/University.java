package final_keyword;

public class University {
    final String UNIVERSITY_NAME="Asian University of Bangladesh";
    final int fees; // blank final variable
    static final double marks; // static blank final variable

    University(){
        fees=12500; // value assign for blank final variable
    }

    static {
        marks=550.6; // value assign for static blank final variable
    }


    void display(){
       // UNIVERSITY_NAME="can't not assign";
        System.out.println("University Name ="+UNIVERSITY_NAME);
        System.out.println("Semester Fees ="+fees);
        System.out.println("Total Marks="+marks);

    }
}
