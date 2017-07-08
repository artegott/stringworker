package com.company;

/**
 * The single implementation of StringsOperations
 */
public class StringWorker implements StringOperations {

    /**
     * implements reverse operation
     *
     * @param str - the string for inverting
     * @return new inverted string
     */
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * implements transforming string to uppercase
     *
     * @param str - the string for transform
     * @return new string in uppercase
     */
    public String toUpper(String str) {
        return str.toUpperCase();
    }

    /**
     * implements transforming string to lowercase
     *
     * @param str - the string for transform
     * @return new string in lowercase
     */
    public String toLower(String str) {
        return str.toLowerCase();
    }

    /**
     * Funny implementation of interface's method
     *
     * @param str - the string for transform
     * @return i don't know, however it looks good
     */
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
