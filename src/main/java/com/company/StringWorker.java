package com.company;

public class StringWorker implements StringOperations {

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String toUpper(String str) {
        return str.toUpperCase();
    }

    public String toLower(String str) {
        return str.toLowerCase();
    }

    public String snake(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }
}
