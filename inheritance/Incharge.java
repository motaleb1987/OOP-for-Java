package inheritance;

public class Incharge extends Employee{
    // setName(), getName(), setAge(),getAge()

    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    void displayInformation(){
        System.out.println("Employee Name = "+getName());
        System.out.println("Employee Age = "+getAge());
        System.out.println("Employee Designation = "+getDesignation());
    }

}
