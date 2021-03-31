import java.util.Scanner;

public class FortuneTeller {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        int usersAge;
        String favoriteColor;
        String siblings;
        int birthMonth;
        String yrsToRetirement;


        System.out.println("What is your first name? ");
        firstName = input.nextLine();
        System.out.println("What is your last name? ");
        lastName = input.nextLine();
        System.out.println("What is your age? ");
        usersAge = input.nextInt();
        System.out.println("What is your favorite color using ROYGBIV? Type help for a lis of colors");
        favoriteColor = input.nextLine();
        System.out.println("How many siblings do you have? ");
        siblings = input.nextLine();
        System.out.println("What is your birth month number? ");
        birthMonth = input.nextInt();


        if (usersAge <= 25) {
            yrsToRetirement = "will retire in 40 years";
            System.out.println("Hello " + firstName + " " + lastName + ", you " + yrsToRetirement);
        } else {
            if (usersAge <= 35) {
                yrsToRetirement = "will retire in 30 years";
                System.out.println("Hello " + firstName + " " + lastName + ", you " + yrsToRetirement);
            } else {
                if (usersAge <= 45) {
                    yrsToRetirement = "will retire in 20 years0";
                } else if (usersAge <= 55) {
                    yrsToRetirement = "will retire in 10 years";
                } else if (usersAge <= 65) {
                    yrsToRetirement = " are retired";
                }
                System.out.println("Hello " + firstName + " " + lastName + ", you " + yrsToRetirement);
            }
        }

    }
}
