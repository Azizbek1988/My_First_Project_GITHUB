package day_33_MethodsWithReturnValure;

public class AgeCalculator {
    public static void main(String[] args) {
        int age = calculateAge(1988);
        System.out.println("You are "+age+" years old");
    }
    /*
    method is calculating age
    print category
    return age value
    ==> age is negative print ' Invalid age ' and return 0;
     */
    public static int calculateAge(int year) {
        int currentYear = 2023;
        int age = currentYear - year;

        if(age < 0) {
            System.out.println("Invalid age");
        }else if(age >= 0 && age <= 14) {
            System.out.println("Child");
        }else if(age >= 15 && age <= 25) {
            System.out.println("Youngsters");
        }else if(age >= 26 && age <= 64){
            System.out.println("Adult");
        }else {
            System.out.println("Senior");
        }
        return age;
    }
}
