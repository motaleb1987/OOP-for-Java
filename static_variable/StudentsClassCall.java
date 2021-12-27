package static_variable;

public class StudentsClassCall {
    public static void main(String[] args) {
        Students s1=new Students("Motaleb Hossain",18601);
        Students s2=new Students("Rashedul Hasan",18602);

        s1.displayInformation();
        s2.displayInformation();
    }
}
