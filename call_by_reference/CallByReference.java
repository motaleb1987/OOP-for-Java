package call_by_reference;

public class CallByReference {
    String name;
    public void change(CallByReference c){ // akhane parameter hisebe class er object use kora hoiche
        c.name="Motaleb";
    }

    public static void main(String[] args) {
        CallByReference ob=new CallByReference();
        ob.name="Jahangir";
        System.out.println("Before Calling :"+ob.name);

        ob.change(ob);
        System.out.println("After Calling :"+ob.name);
    }

}
