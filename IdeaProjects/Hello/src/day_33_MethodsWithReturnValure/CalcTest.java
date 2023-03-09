package day_33_MethodsWithReturnValure;

public class CalcTest {
    public static void main(String[] args) {
        System.out.println(calculatorFinal.divide(8,2));
        System.out.println(calculatorFinal.minus(10,2));
        System.out.println(calculatorFinal.add(5,10));
        System.out.println(calculatorFinal.Multiply(5,45));

        int addResult = calculatorFinal.add(21,41);
        int mResult = calculatorFinal.Multiply(50,40);
        int miResult = calculatorFinal.minus(3000,200);
        int dResult = calculatorFinal.divide(455,5);

        System.out.println("addResult: "+addResult);
        System.out.println("mResult: "+mResult);
        System.out.println("miResult: "+miResult);
        System.out.println("dResult: "+dResult);

        int a = 10, b = 5;
        int myResult = calculatorFinal.Multiply(a,b);
        System.out.println("myResult: "+myResult);

        int[] dNums = {2,4};
        int result2 = calculatorFinal.Multiply(dNums[0],dNums[1]);
        System.out.println("Result2: "+result2);

        if(calculatorFinal.add(10,16)== 26) {
            System.out.println("Add Unit Test Passed.");
        }else {
            System.out.println("Add Unit Test Failed.");
        }
        String str = "Java";
        if(str.length() == 4) {
            System.out.println("It is 4 characters ");
        }else {
            System.out.println("It is not 4 characters");
        }
    }
}
