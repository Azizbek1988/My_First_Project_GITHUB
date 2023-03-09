package day_22_loopsPractice2;

public class SubstringPractice {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.substring(0,2));//ja
        //print each character in separate line using substring, no loop needed

        System.out.println(word.substring(0, 1));//j
        System.out.println(word.substring(1, 2));//a
        System.out.println(word.substring(2, 3));//v
        System.out.println(word.substring(3, 4));//a
        System.out.println("############################");
        int i = 0;                       //0, 1
        System.out.println(word.substring(i,i+1));
        i++;                             //1, 2
        System.out.println(word.substring(i,i+1));
        i++;                             //2, 3
        System.out.println(word.substring(i,i+1));
        i++;                             //3, 4
        System.out.println(word.substring(i,i+1));

        System.out.println("#######FOR LOOP###########");
        //using for loop and substring, print each char
        //java
        //0123
        for(int n = 0; n <= 3; n++){
            //System.out.println(word.substring(n, n+1));
            String letter = word.substring(n,n+1);
            System.out.println(letter);
        }

        System.out.println("##############REVERSE#########");
        //print letters in reverse
        //a
        //v
        //a
        //j
        for(int n = 3; n >= 0; n--){
           String letter = word.substring(n, n+1);
            System.out.println(letter);
        }

        int start = 1;
        int end = 5;  //012345678910111213
        String word2 = "UnitedStates";
        System.out.println(word2.substring(start, end));
        System.out.println(word2.substring(2, 3));//i
        System.out.println(word2.substring(6, 7));//S
        //pass single input. Start only and will include until last character
        System.out.println(word2.substring(6));//States

        //print last character
                      //012345
        String word3 = "apples";
        System.out.println(word3.substring(word3.length()-1));//s
    }
}
