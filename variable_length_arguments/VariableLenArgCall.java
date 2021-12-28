package variable_length_arguments;

public class VariableLenArgCall {
    public static void main(String[] args) {
        VariableLengthArg ob=new VariableLengthArg();
        ob.addDemo(10,20);
        ob.addDemo(10,20,30);
        ob.addDemo(10,20,30,40);
        ob.addDemo(10,20,30,40,50);

    }
}
