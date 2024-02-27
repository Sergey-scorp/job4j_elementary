package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int position1 = x2 - x1;
        int position2 = y2 - y1;
        double first = Math.pow(position1, 2);
        double two = Math.pow(position2, 2);
        double sum = first + two;
        double result = Math.sqrt(sum);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 3, 2);
        System.out.println("result (1, 1) to (3, 2) = " + result);
    }
}
