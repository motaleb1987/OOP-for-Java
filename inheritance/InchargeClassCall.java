package inheritance;

public class InchargeClassCall {
    public static void main(String[] args) {
        Incharge emp=new Incharge();
        emp.setName("Motaleb Hossain");
        emp.setAge(35);
        emp.setDesignation("Sr. Principle Officer-2");
        emp.displayInformation();

        System.out.println("\n");

        Incharge emp2=new Incharge();
        emp2.setName("Rashed vai");
        emp2.setAge(35);
        emp2.setDesignation("Sr. Deputy Director");
        emp2.displayInformation();

    }
}
