package day_28_multi_arrays;

import java.util.Arrays;

public class Loop2DArrays {
    public static void main(String[] args) {
        String[][] pizzas = {
                {"pineapple", "pepperoni",},//0
                {"anchovies", "mushroom", "olives"},//1
                {"4 choose"},//2
                {"chicken", "tomatoes", "japalenios", "onions"},//3 index
                {"green peppers", "zuccini", "brocolli", "spinach", "shrim"} //4 indexes.5 items
        };
        System.out.println(Arrays.toString(pizzas[0]));
        for (String[] pizza : pizzas) {
            System.out.print(pizza.length + "-");
            System.out.println(Arrays.toString(pizza));
        }
        System.out.println("#########FOR LOOP######################");
        for (int i = 0; i < pizzas.length; i++) {
            System.out.print(pizzas[i].length + "-");
            System.out.println(Arrays.toString(pizzas[i]));
        }
        System.out.println("###########################################");
        for (String topping : pizzas[4]) {
            System.out.print(topping + " - ");

        }
        System.out.println();
        System.out.println("#######################################");
        int[][] students = {
                {4, 5, 6},
                {12, 5, 7},
                {23, 55, 12, 55, 3}
        };

        //2 parts: outer loop, inner loop
        //outer loop will take each group
        //inner loop will take each value/student id
        for (int[] group : students) {
            for (int studentId : group) {
                System.out.print(studentId + ", ");
            }
            System.out.println();
        }
        System.out.println("()()()()()()()()()()()()()()()()()()()()()");
        int [][] nums = {
                {10,20},
                {20,30,40,50},
                {100,200,400},
                {555,333,111,444,666,78}
                 };
        for(int i = 0; i < nums.length;i++){
            for(int j = 0;j<nums[i].length; j++){
                System.out.print(nums[i][j]+" ");
            }

        }
    }
}