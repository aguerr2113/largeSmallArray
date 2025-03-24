import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // create scanner object for user input
        Scanner sc = new Scanner(System.in);
        // create int variable for captureing the length of the array
        int lengthList = 0;
        // create boolean for checkingif user input is valid or not
        boolean validInput = false;

        // while user input isinvalid do this
        while (!validInput) {
            System.out.println("How many inputs will the length of this list be: ");
            // if object is a integer do this
            if (sc.hasNextInt()) {
                // set checker to true
                validInput = true;
                // save user input as the length of list
                lengthList = sc.nextInt();
                // create array variable
                int[] inArray = new int[lengthList];
                // for loop that runs the length of the number the user input
                for (int i = 0; i <= lengthList - 1; i++) { 
                    // every time this itterates it will ask the user for a number
                    System.out.println("What is the " + (i + 1) + " number in the list: ");
                    inArray[i] = sc.nextInt();
                }
                System.out.println("You entered: " + Arrays.toString(inArray));
            }
            
            else{
                System.out.println("Invalid input: ");
                sc.next();
            }
        }
    }
}
