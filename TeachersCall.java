package com.company;

public class TeachersCall {
    public static void main(String[] args) {
        Teachers teachers1=new Teachers();
        teachers1.name="Motaleb Hossain";
        teachers1.gender="Male";
        teachers1.mobile=1911542763;
        System.out.println("First Teachers is: ");

        System.out.println("Name :"+teachers1.name);
        System.out.println("Gender :"+teachers1.gender);
        System.out.println("Mobile :"+teachers1.mobile);
        System.out.println();

        System.out.println("Second Teachers is: ");
        Teachers teachers2=new Teachers();
        teachers2.name="Jahangir Alam";
        teachers2.gender="Male";
        teachers2.mobile=1911572768;

        System.out.println("Name :"+teachers2.name);
        System.out.println("Gender :"+teachers2.gender);
        System.out.println("Mobile :"+teachers2.mobile);
    }
}
