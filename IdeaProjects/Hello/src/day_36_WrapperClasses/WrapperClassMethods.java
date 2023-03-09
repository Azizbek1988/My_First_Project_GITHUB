package day_36_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        //convert string to primitive
        int count = Integer.parseInt("345356");
        System.out.println("count: "+count);

        int count2 = Integer.valueOf("56565");//unboxing
        System.out.println("count2: "+count2);

        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isAlphabetic('1'));
        System.out.println(Character.isAlphabetic('@'));

        System.out.println(Character.isLetter('j'));
        System.out.println(Character.isLetter('!'));

        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isDigit('p'));
        String str = "java101";
        System.out.println(Character.isAlphabetic(str.charAt(0)));
        System.out.println(Character.isDigit(str.charAt(6)));

        String word = "ab123c5dfer1";
        for(int i = 0; i < word.length(); i++) {
            if(Character.isDigit(word.charAt(i))) {
                System.out.println(word.charAt(i));
            }
        }
    }
}
