package day_39_ArrayListCoustomMethods;
import java.util.*;
public class UniqueValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(10);
        nums1.add(10);nums1.add(7);nums1.add(8);
        nums1.add(8);nums1.add(3);nums1.add(4); nums1.add(8);

        System.out.println(nums1);
        //1.find NON Dublicate - unique values. if there 2 AA -> A
        //[10,10,7,8,8,3,4,8]
        //10,7,8,3,4
        List<Integer> unique1 = new ArrayList<>();
        for(Integer num : nums1) {
            //assign num to unique1 if nums is not already there
            if(!unique1.contains(num)){
                unique1.add(num);
            }
        }
        System.out.println(unique1);

        //2. find unique(appearing once) values
        //[10,10,7,8,8,3,4,8]
        //7,3,4

        List<Integer> unique2 = new ArrayList<>();

        for(int i = 0; i < nums1.size(); i++) {
            int count = 0;
            Integer value = nums1.get(i);
            for(int k = 0; k < nums1.size(); k++){
                if(nums1.get(k) == value && i != k) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                unique2.add(value);
            }
        }
        System.out.println(unique2);


    }
}
