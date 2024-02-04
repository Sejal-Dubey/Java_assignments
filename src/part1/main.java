package part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) {
        input userInput = new input(); // create an instance of the input class

        System.out.println("Choose an input method:");
        System.out.println("1. Command Line Arguments");
        System.out.println("2. Scanner");
        System.out.println("3. BufferedReader");
        System.out.println("4. DataInputStream");
        System.out.println("5. Console");

        int choice;
        try {
            choice = Integer.parseInt(userInput.getInput("Enter your choice (1-5): "));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }

        switch (choice) {
            case 1:
                userInput.useCommandLineArgs(args);
                break;
            case 2:
                userInput.useScanner();
                break;
            case 3:
                userInput.useBufferedReader();
                break;
            case 4:
                userInput.useDataInputStream();
                break;
            case 5:
                userInput.useConsole();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }
    }
}
