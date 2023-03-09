package day_38_arraylist03;
import java.util.*;
public class ContainsAll {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(10);nums1.add(20);nums1.add(30);nums1.add(40);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(20);nums2.add(10);nums2.add(40);nums2.add(30);

        //test if nums1 has all nums2 values
        if(nums1.containsAll(nums2)){
            System.out.println("Nums1 containsAll nums2");
        }else {
            System.out.println("Nums1 does not containsAll nums2");
        }
        System.out.println(nums2.containsAll(nums1));//true

        boolean b = nums1.containsAll(nums2) && nums2.containsAll(nums1);
        System.out.println(b);

        List<String> planA = new ArrayList<>();
        planA.add("java");
        planA.add("replit");
        planA.add("ping pong");
        planA.add("food");
        planA.add("run");
        planA.add("sleep");

        List<String> planB = new ArrayList<>();
        planB.add("food");
        planB.add("run");
        planB.add("sleep");
        planB.add("java");
        planB.add("ping pong");
        planB.add("replit");
        //check if both have same values, ignoring order
        if(planB.containsAll(planA) && planA.containsAll(planB)){
            System.out.println("PlanA and PlanB match");
        }else {
            System.out.println("PlanA and PlanB do not match");
        }
    }
}
