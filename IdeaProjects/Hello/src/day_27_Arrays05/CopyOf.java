package day_27_Arrays05;
import java.util.*;
public class CopyOf {
    public static void main(String[] args) {
        double[] d1 = {2.3,4.5,12.4};
        double[] d2 = d1;

        System.out.println(Arrays.toString(d1));
        System.out.println(Arrays.toString(d1));

        d1[0] = 1000.3;
        System.out.println(Arrays.toString(d1));
        System.out.println(Arrays.toString(d1));

        double[] d3 = Arrays.copyOf(d2,d2.length);

        System.out.println(Arrays.toString(d3));

        d2[0] = 1;
        System.out.println(Arrays.toString(d3));
        System.out.println(Arrays.toString(d2));
    }
}
