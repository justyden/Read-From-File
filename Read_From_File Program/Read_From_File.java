import java.io.*;
import java.util.Scanner;

public class Read_From_File {
    public static void main(String[] args) throws IOException {
        // Create variables and objects.
        String file_data, file_name, proceed_program;
        Scanner user_input = new Scanner(System.in);

        // Make sure the program runs at least once. Then ask for more after.
        do {
            // Ask the user for the directory of the file.
            System.out.println("Please input the directory to the file.");
            file_name = user_input.nextLine();

            // Create a file object.
            File created_file = new File(file_name);

            // Check to make sure the file exists before the program keeps going.
            if (!created_file.exists()) {
                System.out.println("The file does not exist.");
                System.exit(0);
            }

            // Create a scanner object that reads the file.
            Scanner readable_file = new Scanner(created_file); // Input the file that was created as the reference
                                                               // object.

            // Check to make sure the file has lines to read and display them.
            while (readable_file.hasNext()) {
                file_data = readable_file.nextLine(); // Sets the string reference to the line of text in the file.
                System.out.println(file_data);
            }
            // Ask the user if the wish to put in another file to read.
            System.out.println("Would you like to scan another file?");
            proceed_program = user_input.nextLine();

            // Close the file.
            readable_file.close();
        } while (proceed_program.charAt(0) == 'y' || proceed_program.charAt(0) == 'Y');

        // Close the remaining objects.
        user_input.close();
    }
}