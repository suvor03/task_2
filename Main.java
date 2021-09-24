package ru.vsu.cs.suvorov_d_a;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        double x = readNumber("abscissa");
        double y = readNumber("ordinate");

        String analysis = checkPoint(x, y);
        printAnswer(analysis);

    }

    private static double readNumber(String namePoint) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the %s of the point: ", namePoint);
        double value = 0;

        if(scanner.hasNextDouble()) {
            value = scanner.nextDouble();
        }
        else {
            System.out.println("Error. You need to enter a number");
            System.exit(0);
        }

        return value;
    }

    private static String checkPoint(double x, double y) {
        String coordinate_plane;

        if(x>0 & y>0) {
            coordinate_plane = "I quarter";
        }
        else if(x<0 & y>0) {
            coordinate_plane = "II quarter";
        }
        else if(x<0 & y<0) {
            coordinate_plane = "III quarter";
        }
        else if(x>0 & y<0) {
            coordinate_plane = "IV quarter";
        }
        else if(x==0 & y==0) {
            coordinate_plane = "origin: (0;0)";
        }
        else if(x==0 & y!=0) {
            coordinate_plane = "point is on the ordinate";
        }
        else {
            coordinate_plane = "point is on the abscissa";
        }

        return coordinate_plane;
    }

    private static void printAnswer(String coordinate_plane) {
        System.out.println("Point location: " + coordinate_plane);
    }
}