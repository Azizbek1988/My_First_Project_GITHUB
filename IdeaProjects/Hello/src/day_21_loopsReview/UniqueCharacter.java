package day_21_loopsReview;

public class UniqueCharacter {
    public static void main(String[] args) {
        //01234
        String word = "javva";
        String unique = "";

        char ch = word.charAt(0);
        System.out.println(unique.contains("" + ch));
        System.out.println(unique.indexOf(0));
        if (!unique.contains(" " + ch)) {
            unique += ch; //unique = unique+ch;

        }
        if (unique.indexOf(ch) == -1) {
            unique += ch; //"ab"

        }
        System.out.println("Unique:" + unique);

    String word2 = "bananas";
    String unique2 = "";

    int i = 0;
    char ch2 = word2.charAt(i);
        System.out.println("Ch2: "+ch2);
    }
}
