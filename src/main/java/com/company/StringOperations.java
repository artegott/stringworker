package com.company;

/**
 * This is the common interface for string operations
 */
public interface StringOperations {
    /**
     * Turns over the string
     *
     * @param str - the string for inverting
     * @return the inverted string
     */
    String reverse(String str);

    /**
     * Makes the string in uppercase
     *
     * @param str - the string for transform
     * @return the new string in uppercase
     */
    String toUpper(String str);

    /**
     * Makes the string in lowercase
     *
     * @param str - the string for transform
     * @return the string in lowercase
     */
    String toLower(String str);

    /**
     * Makes the string with variable letter sizes
     *
     * @param str - the string for transform
     * @return the new string with different letter sizes
     */
    String snake(String str);
}
