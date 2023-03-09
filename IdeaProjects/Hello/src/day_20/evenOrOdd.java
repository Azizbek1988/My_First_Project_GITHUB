package day_20;

public class evenOrOdd {
    public static void main(String[] args) {
        //if statement
        //using for loop: 1-100
        //1.print all even numbers in same line
        for(int n = 1; n <=100; n++){
            if(n%2==0){//check it is even
                System.out.print(n+" ");
            }
        }
        //2.print all odd numbers in same line
        System.out.println();
        for(int j = 1; j <=100; j++){
            if( j % 2 !=0){
                System.out.print(j +" ");
            }
        }
        //3.sumOfOdds, sumOfEvens - calculate them
        //and print out after the loops
        //sum of 1-10
        //1+2+3+4+5+6+7+8+9+10
        int sumOfOdds = 0;
        int sumOfEvens = 0;

        System.out.println();

        for(int num = 1; num <=100; num++){
            if(num % 2 ==0){
                sumOfEvens += num;
            }else{
                sumOfOdds += num;
            }
        }
        System.out.println("Sum of evens:" +sumOfEvens);
        System.out.println("Sum of odds:" +sumOfOdds);

    }
}
