package day_36_WrapperClasses;

public class Boxing {
    public static void main(String[] args) {
        //AUTOBOXING -> primitive > object
        Integer num1 = 1234;
        int n = 5;
        Integer num2 = n;
        //UNBOXING -> object > primitive
        Double d1 = new Double(34.2);
        double d2 = d1;
        System.out.println("d1: "+d1);
        System.out.println("d2: "+d2);

        long l1 = new Long(600000);//unboxing
        long l2 = new Long(34543543L);//no boxing
        long l3 = l2;//auto - unboxing
        Long l4 = l3;//auto - boxing

        Integer num3 = Integer.valueOf(345);
        //Double d3 = num3; casting not possible with wrapper classes

    }
}
