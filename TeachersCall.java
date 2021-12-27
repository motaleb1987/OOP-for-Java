package com.company;

public class TeachersCall {
    public static void main(String[] args) {
        Teachers teachers1=new Teachers("Motaleb Hossain","Male",1911542763);
        //teachers1.setInformation("Motaleb Hossain","Male",1911542763);
        teachers1.displayInformation();


        Teachers teachers2=new Teachers("Jahangir Alam","Male",1911572768);
       // teachers2.setInformation("Jahangir Alam","Male",1911572768);
        teachers2.displayInformation();


        Teachers teachers3=new Teachers();
        teachers3.displayInformation();

    }
}
