package day_31_MethodsWithParams;

public class Authentication {
    public static void main(String[] args) {
        /*
        Name: Login
        Return type: void
        2 String args/params: userName, password
        Inside the method:
        validUsername = mentoring@cybertekschool.com
        validPassword = "mentor001

        if username and password match, print "Login Successful! Welcome to Okta"
        if not: "Sign in failed!
         */
        login("mentoring@cybertekschool.com","mentor001");//Login Successful
        login("mentoring@cybertekschool.com","mentor002");//Sign in failed
    }
    public static void login(String userName,String password) {
        String validUsername = "mentoring@cybertekschool.com";
        String validPassword = "mentor001";

        if(userName.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
            System.out.println("Login Successful, Welcome to Okta!");
        }else{
            System.out.println("Sign in failed!");
        }




    }
}
