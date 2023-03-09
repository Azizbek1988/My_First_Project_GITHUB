package day_33_MethodsWithReturnValure;

public class calculatorFinal {
    public static void main(String[] args) {
        /*
        method addVoid
        return type: void
        params: int num1, int num2
        add them and print sum
         */
        addVoid(2,5);
        //below line will not work because addVoid does not
        //return a value. It just performe action.
        //int result = addVoid(5,1);//does not work
        int result = add(10,30);
        System.out.println("Result: "+result);
    }
    /*
    Method: Multiply with return value
    Method: minus with return value
    Method: divide with return value
     */
    public static int Multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    public static int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    public static int divide(int num1, int num2) {
        if(num2 == 0) {
            System.out.println("ERROR: Cannot / by 0");
            return 0;
            //System.exit(0);// stop the whole code
        }else {

        }
        int result = num1 / num2;
        return result;
    }


    public static void addVoid(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: "+sum);
    }
    /*
    method name: add
    return type: int
    params: int num1, int num2
    add them and return the sum
     */
    public static int add(int num1, int num2) {
       int sum = num1 + num2;
       return sum;
    }

}
