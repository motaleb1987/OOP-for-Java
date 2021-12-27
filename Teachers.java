package com.company;

public class Teachers {
    String name, gender;
    int mobile;


    //Default Constructor
    Teachers(){
        System.out.println("There is No Values..");
    }

    //parameterized constructor
    Teachers(String n,String g,int mob){
        name=n;
        gender=g;
        mobile=mob;
    }

    /*
        void setInformation(String n,String g,int mob){
            name=n;
            gender=g;
            mobile=mob;
        }
    */
    void displayInformation(){
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Mobile :"+mobile);
        System.out.println();
    }
}
