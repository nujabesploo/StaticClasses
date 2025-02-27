package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first_name = in.nextLine();

        System.out.print("Enter your last name: ");
        String last_name = in.nextLine();

        System.out.print("Enter your middle name: ");
        String middle_name = in.nextLine();

        System.out.print("Enter your prefix name: ");
        String prefix_name = in.nextLine();

        System.out.print("Enter your suffix name: ");
        String suffix_name = in.nextLine();

        String fullName = prefix_name + " " + first_name + " " + middle_name + " " + last_name + ", " + suffix_name;

        System.out.println("LastName, Prefix FirstName MiddleName, Suffix");
        System.out.println(NameFormatter.format(fullName));
        System.out.println(NameFormatter.format(first_name, middle_name, last_name, suffix_name));
        System.out.println(NameFormatter.format(first_name, last_name));

    }
}
