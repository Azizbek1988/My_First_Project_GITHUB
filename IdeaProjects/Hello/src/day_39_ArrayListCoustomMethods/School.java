package day_39_ArrayListCoustomMethods;

public class School {
    public static void main(String[] args) {
        //create object from Student class
        Student student = new Student();
        student.name = "Roman";
        student.age = 25;
        student.subject = "Java";

        System.out.println("Name: "+student.name);
        System.out.println("Age: "+student.age);
        System.out.println("Subject: "+student.subject);
        System.out.println();

        Student student2 = new Student();
        student2.name = "Cleetus";
        student2.age = 33;
        student2.subject = "Selenium";

        System.out.println("Name: "+student2.name);
        System.out.println("Age: "+student2.age);
        System.out.println("Subject: "+student2.subject);

    }
}
