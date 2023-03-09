package day_28_multi_arrays;
import java.util.*;
public class ReverseSentence {
    public static void main(String[] args) {
        String str1 = "You are very interesting person";
        //split by space

        String[] strArr = str1.split(" ");
        System.out.println(strArr.length);

        System.out.println(Arrays.toString(strArr));

        String reversed = "";

        for(int i = strArr.length-1;i >= 0; i--) {
            // System.out.println(strArr[i]);
            reversed += strArr[i] + " ";
        }
        reversed = reversed.trim();
        System.out.println(reversed);
    }
}
