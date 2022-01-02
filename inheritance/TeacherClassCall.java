package inheritance;

public class TeacherClassCall {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Motaleb";
        teacher.age=35;
        teacher.qualifications="Masters in CSE";

        teacher.displayInformation2();
        System.out.println("-----------");
        Teacher teacher2=new Teacher();
        teacher2.name="Rashed";
        teacher2.age=33;
        teacher2.qualifications="Masters in ICT";

        teacher2.displayInformation2();
    }
}
