package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringApp {
    public static void main(String[] args) {
        System.out.print("Input string for showing our operations with it: ");
        StringWorker stringWorker = new StringWorker();
        String inputString = readConsoleLine();
        print(String.format("Operation with '%s':", inputString));
        print(String.format("reverse operation: %s;", stringWorker.reverse(inputString)));
        print(String.format("'%s' in upper case : %s;", inputString, stringWorker.toUpper(inputString)));
        print(String.format("'%s' in lower case : %s;", inputString, stringWorker.toLower(inputString)));
    }

    public static String readConsoleLine() {
        String line = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
