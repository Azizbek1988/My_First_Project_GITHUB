package day_27_Arrays05;
import java.util.*;
public class arraysEquals {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,10,100};
        int[] nums2 = {4,5,6,10,100};
        System.out.println(Arrays.equals(nums1,nums2));

        if(Arrays.equals(nums1,nums2)){
            System.out.println("They are exactly same");
        }else {
            System.out.println("Mismatched values present");
        }

        String[] strarr1 = {"one","two","three"};
        String[] strarr2 = {"one","two","three"};

        System.out.println(Arrays.equals(strarr1,strarr2));

        boolean match = Arrays.equals(strarr1,strarr2);
        System.out.println("Match: "+match);
    }
}
