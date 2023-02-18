package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.
    void run(Scanner scanner) {
        System.out.println("Podaj współrzędną X: ");
        int x = scanner.nextInt();
        System.out.println("Podaj współrzędną Y: ");
        int y = scanner.nextInt();
        Point point = new Point(x, y);
        System.out.println("Punkt (" + x + ", " + y + ") " + getPointPosition(point));
    }

    String getPointPosition(Point point) {
        String pointPosition = "";
        if (isInFirstQuarter(point)) {
            pointPosition = "leży w I ćwiartce układu współrzędnych";
        } else if (isInSecondQuarter(point)) {
            pointPosition = "leży w II ćwiartce układu współrzędnych";
        } else if (isInThirdQuarter(point)) {
            pointPosition = "leży w III ćwiartce układu współrzędnych";
        } else if (isInFourthQuarter(point)) {
            pointPosition = "leży w IV ćwiartce układu współrzędnych";
        } else if (isInCentreOfCoordinateSystem(point)) {
            pointPosition = "leży na środku układu współrzędnych";
        } else if (isOnxAxis(point)) {
            pointPosition = "leży na osi X";
        } else if (isOnyAxis(point)) {
            pointPosition = "leży na osi Y";
        }

        return pointPosition;
    }

    boolean isInFirstQuarter(Point point) {
        return point.getX() > 0 && point.getY() > 0;
    }

    boolean isInSecondQuarter(Point point) {
        return point.getX() < 0 && point.getY() > 0;
    }

    boolean isInThirdQuarter(Point point) {
        return point.getX() < 0 && point.getY() < 0;
    }

    boolean isInFourthQuarter(Point point) {
        return point.getX() > 0 && point.getY() < 0;
    }

    boolean isOnxAxis(Point point) {
        return point.getY() == 0;
    }

    boolean isOnyAxis(Point point) {
        return point.getX() == 0;
    }

    boolean isInCentreOfCoordinateSystem(Point point) {
        return isOnxAxis(point) && isOnyAxis(point);
    }
}
