import java.util.Scanner;

public class control_flow {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter your age: ");
        int userAge = input.nextInt();
        if (userAge < 0 || userAge > 100) {
            System.out.println("You entered an invalid age");
            System.out.println("You must enter an age between 0 and 100");
        } else if (userAge < 18)
            System.out.println("You are underage!");
        else if (userAge < 21)
            System.out.println("You need consent from your parents");
        else {
            System.out.println("Congratulations!");
            System.out.println("You are all set to sign up...");
        }

        // now what the hell is a ternary operator? Already know that, let's try something myself for a change
        String firstConditionMet = "The first condition was met!";
        String secondConditionMet = "The second condition was met";
        String somethingToTestThis = firstConditionMet.length() == secondConditionMet.length() ? firstConditionMet : secondConditionMet;
        System.out.println(somethingToTestThis);

        // switch statements



    }
}
