package day_23_breakAndContinue;

public class ArraysString {
    public static void main(String[] args) {
        String[] names = new String[5];
        String[] names2 = {"Bill","Roman","Burak","Maria","Aziz"};

        System.out.println(names2[4]);
        System.out.println("Number of items "+names2.length);
        String[] countries = {};
        //Array has fixed size
        //countries[0] = "USA";
        String name = null;
        String[] fruits = new String[]{"apples","orange","bananas",""};
        //for each loop stands for collections of data
        //we need specify data type, variable name : our collection of data
        //for each loop
        //or enhanced(увеличивать) loop
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
