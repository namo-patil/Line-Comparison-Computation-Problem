package com.bridgelabz.computationprogram;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        checkEqualityOfTwoLines();
        compareTwoLines();
    }

    static String calLengthOfLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of co-ordinates x1, y1, x2, y2 :");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
        String lengthOfLine = String.valueOf(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("Length of Line (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is :" + lengthOfLine);
        System.out.println();
        return lengthOfLine;
    }

    // Prints true => equals, and Prints false => distinct
    static void checkEqualityOfTwoLines() {
        String line1 = calLengthOfLine();
        String line2 = calLengthOfLine();
        System.out.println("---Equals Method---");
        System.out.println(line1.equals(line2));
    }

    // s1=s2 => returns 0,  s1>s2 => returns +ve value,  s1<s2 => returns -ve value
    static void compareTwoLines() {
        String line1 = calLengthOfLine();
        String line2 = calLengthOfLine();
        System.out.println("---CompareTo Method---");
        System.out.println(line1.compareTo(line2));
    }
}
