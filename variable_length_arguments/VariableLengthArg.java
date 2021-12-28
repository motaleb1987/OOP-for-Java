package variable_length_arguments;

public class VariableLengthArg {
    // Tutorial number 103

    public void addDemo(int ... num){

        int sum=0;
        for (int i : num) {
            sum=sum+i;
        }
        System.out.println("Total sum ="+sum);

    }


}
