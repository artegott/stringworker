package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Simple user's application for demonstrating string's operations
 */
public class StringApp {
    public static void main(final String[] args) {
        System.out.print("Input string for showing our operations with it: ");
        StringWorker stringWorker = new StringWorker();
        String inputString = readConsoleLine();
        print(String.format("Operation with '%s':", inputString));
        print(String.format("reverse operation: %s;",
                stringWorker.reverse(inputString)));
        print(String.format("'%s' in upper case : %s;", inputString,
                stringWorker.toUpper(inputString)));
        print(String.format("'%s' in lower case : %s;", inputString,
                stringWorker.toLower(inputString)));
        print(String.format("snake operation : %s;",
                stringWorker.snake(inputString)));
    }

    /**
     * Method for reading the only one string from console
     *
     * @return text from console as one string
     */
    public static String readConsoleLine() {
        String line = "";
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public static void print(final String str) {
        System.out.println(str);
    }
}
