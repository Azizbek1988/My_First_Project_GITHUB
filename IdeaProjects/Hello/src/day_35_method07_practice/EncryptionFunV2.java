package day_35_method07_practice;

public class EncryptionFunV2 {
    public static void main(String[] args) {
        System.out.println(encryptChar('z'));
        System.out.println(encryptChar('m'));

       String normal = "hurshida";
       String encrypted = encryptWord(normal);
        System.out.println("Normal: "+normal+"\n"+"encrypted: "+encrypted);
    }

    /*
    encryptChar
    return type: char
    param: char
    takes a char and returns encrypted version
    encryptChar('a') ==> 'z'
     */
    public static char encryptChar(char ch) {
        String alphabet =  "abcdefghijklmnopqrstuvwxyz";
        String encrypted = "zyxwvutsrqponmlkjihgfedcba";
        //return encrypted.charAt(alphabet.indexOf(ch));
        int i = alphabet.indexOf(ch);
        char ret = encrypted.charAt(i);
        return ret;
    }


    /*
    encryptWord
    return type: String
    param: String
    take a String and returns encrypted version for the whole word
     */
    public static String encryptWord(String word) {
        String cyphered = "";
        for (int i = 0; i < word.length();i++) {
            cyphered += encryptChar(word.charAt(i));
        }
        return cyphered;
    }
}
