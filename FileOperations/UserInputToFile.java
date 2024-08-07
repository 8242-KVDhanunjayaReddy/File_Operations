package FileOperations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input: ");
        String userInput = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter("user_input.txt")) {
            fileWriter.write(userInput);
            System.out.println("User input has been written to user_input.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

