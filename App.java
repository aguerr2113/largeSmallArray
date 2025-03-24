import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        int lengthList = 0;
        boolean validInput = false;

        // While user input is invalid do this
        while (!validInput) {
            System.out.println("How many inputs will the length of this list be: ");
            
            if (sc.hasNextInt()) {
                lengthList = sc.nextInt();

                // Check if the length is greater than 0
                if (lengthList <= 0) {
                    System.out.println("Invalid input: List length must be greater than 0.");
                    continue; // Ask for input again
                }

                validInput = true; // Input is valid, exit loop

                // Create array
                int[] inArray = new int[lengthList];

                // Loop to get user input
                for (int i = 0; i < lengthList; i++) { 
                    System.out.println("Enter number " + (i + 1) + ": ");
                    inArray[i] = sc.nextInt();
                }

                // Create a copy and sort the array
                int[] newArray = Arrays.copyOf(inArray, inArray.length);
                Arrays.sort(newArray);

                // Print sorted array
                System.out.println("Sorted array: " + Arrays.toString(newArray));

                // Print lowest and highest numbers
                System.out.println("The lowest number is: " + newArray[0]);
                System.out.println("The highest number is: " + newArray[newArray.length - 1]);
            } 
            else {
                System.out.println("Invalid input: Please enter an integer.");
                sc.next(); // Consume invalid input
            }
        }

        sc.close(); // Close scanner to prevent resource leak
    }
}
