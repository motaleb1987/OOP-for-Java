package encapsulation;

public class Encapsulation {
    /*
     Encapsulation condtion
     1. variable declare with Private
     2. variable er value chage korar jonno set & get method use korte hobe.

        Note: Auto Setter and getter code gererate
        1. Code->Generate Or Atl+Insert
     */

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
