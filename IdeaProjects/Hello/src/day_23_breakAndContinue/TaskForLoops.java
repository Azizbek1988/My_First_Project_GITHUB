package day_23_breakAndContinue;

public class TaskForLoops {
    public static void main(String[] args) {
        for(int n = 1; n <= 50; n++){
            if(n % 20 == 0){
                break;
            }
            if(n % 5 == 0){
                continue;
            }
            System.out.print(n+",");
        }
    }
}
