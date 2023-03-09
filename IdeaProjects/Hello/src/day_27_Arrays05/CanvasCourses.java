package day_27_Arrays05;

public class CanvasCourses {
    public static void main(String[] args) {
        String url = "https://learn.cybertekschool.com/courses/149";

        // 147 Java programming
        // 204 Mentoring sessions
        // 149 SDLC
        // 152 QA Testing
        // 144 Team activity
        // 143 Welcome Kit

        //split by / and store into array
        String[] urlArr = url.split("/");
        System.out.println("Length: "+urlArr.length);

        //get last number and convert to int data type
        System.out.println(urlArr[urlArr.length-1]);

        //convert to int from String
        int courseID = Integer.parseInt(urlArr[urlArr.length-1]);

        // use switch statement to find course name
        switch(courseID){
            case 147:
                System.out.println("Java programming");
                break;
            case 204:
                System.out.println("Mentoring session");
                break;
            case 149:
                System.out.println("SDlC");
                break;
            case 152:
                System.out.println("QA Testing");
                break;
            case 144:
                System.out.println("Team Activity");
                break;
            case 143:
                System.out.println("Welcome Kit");
                break;
            default:
                System.out.println("Invalid number for the course");
                break;
        }
    }
}
