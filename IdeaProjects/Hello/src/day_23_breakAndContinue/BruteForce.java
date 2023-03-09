package day_23_breakAndContinue;

import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ExpectedUserName = "admin";
        String ExpextedPassword = "admin123";
        String username = "";
        String password = "";
        int attempts = 5;
        do {
            if (attempts == 0) {
                System.out.println("You have exceeded number of attempts");
                System.out.println("This user has been deactivated for 30 minutes");
                return;
            }
            attempts--;
            System.out.println("Please enter username:");
            username = scan.next();
            if (!username.equals(ExpectedUserName)) {
                System.out.println("Wrong username");
                System.out.println("Attempts left: " + attempts);
                continue;
            }

            System.out.println("Please enter password:");
            password = scan.next();
            if (!password.equals(ExpextedPassword)) {
                System.out.println("Wrong password");
                System.out.println("Attempts left: " + attempts);
                continue;
            }
        }while (!username.equals(ExpectedUserName) || !password.equals(ExpextedPassword));
            System.out.println("Login successful!");

        }
    }

