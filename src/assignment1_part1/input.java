package assignment1_part1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class input {
    void useCommandLineArgs(String[] args) {
        if (args.length > 0) {
            System.out.println("Command Line Arguments: " + args[0]);
        } else {
            System.out.println("No command line arguments provided.");
        }
    }

     void useScanner() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Scanner: " + scanner.nextLine());
        }
    }

    void useBufferedReader() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("BufferedReader: " + reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     void useDataInputStream() {
        try (DataInputStream dis = new DataInputStream(System.in)) {
            System.out.println("DataInputStream: " + dis.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void useConsole() {
        System.out.println("Console: ");
        Console console = System.console();
        if (console != null) {
            String input = console.readLine();
            System.out.println("Console: " + input);
        } else {
            System.out.println("Console not available.");
        }
    }

    static String getInput(String prompt) {
        System.out.print(prompt);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
