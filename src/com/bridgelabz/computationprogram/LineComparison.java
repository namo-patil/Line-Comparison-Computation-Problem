package com.bridgelabz.computationprogram;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of co-ordinates x1, y1, x2, y2 :");
        double x1 = scanner.nextInt(), y1 = scanner.nextInt(), x2 = scanner.nextInt(), y2 = scanner.nextInt();
        double length_Line = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Using Cartesian System");
        System.out.println("Length of Line (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is :" + length_Line);
    }
}
