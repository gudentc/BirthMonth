import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        int birthMonth = 0;
        String trash = "";

        // Get input and test
        System.out.print("\nWhat is your birth month [1 - 12]: ");
        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine(); // Clears the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou must enter a number 1 - 12, not " + trash);
            System.out.println("Rerun the program!");
            System.exit(0);
        }
        // We make it here we have an integer.
        if (birthMonth >= 1 && birthMonth <=12) {
            System.out.println("\nYour Birth Month is: " + birthMonth);
        }
        else {
            System.out.println("You entered and invalid month variable: " + birthMonth);
        }

    }
}