package main.java;

import java.awt.*;

public class Points {

    double p1 = 2.4;
    double p2 = 3.4;

    public static void main(String[] args) {
        System.out.println("Distance between points equals " + distance(2.4, 3.4));
    }

    public static double Point(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public static double distance(double p1, double p2) {
        return p2 - p1;
    }
}