package com.bridgelabz.computationprogram;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        checkEqualityOfTwoLines();
    }
    public String calLengthOfLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of co-ordinates x1, y1, x2, y2 :");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
        String length_Line = String.valueOf(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("Using Cartesian System");
        System.out.println("Length of Line (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is :" + length_Line);
        System.out.println();
        return length_Line;
    }
    static void checkEqualityOfTwoLines(){
        LineComparison lineComparison = new LineComparison();
        String line_1 = lineComparison.calLengthOfLine();
        String line_2 = lineComparison.calLengthOfLine();
        System.out.println("Using Equals Method");
        if (line_1.equals(line_2)) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are Distinct");
        }
    }
}
