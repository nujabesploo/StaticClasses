package com.pluralsight;

public class NameFormatter {

    public static String format(String firstName, String lastName) {

        return firstName + ", " + lastName;

    }

    public static String format(String firstName, String middleName, String lastName, String suffix) {
        return firstName + ", " + middleName + " " + lastName + ", " + suffix;
    }

    public static String format(String fullName) {
        // Assuming fullName is already formatted correctly
        return fullName;
    }

}
