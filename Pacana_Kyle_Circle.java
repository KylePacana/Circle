/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacana_kyle_circle;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Pacana_Kyle_Circle {

    /**
     * @param args
     */
    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the radius of the circle: ");
            double userRadius = scanner.nextDouble();

            Circle myCircle = new Circle(userRadius);

            System.out.println("Radius: " + myCircle.getRadius());
            System.out.println("Area: " + myCircle.getArea());
            System.out.println("Circumference: " + myCircle.getCircumference());
            System.out.println("Diameter: " + myCircle.getDiameter());

            System.out.print("\nEnter a new radius: ");
            double newRadius = scanner.nextDouble();
            myCircle.setRadius(newRadius);

            System.out.println("\nUpdated Circle Details:");
            System.out.println("Radius: " + myCircle.getRadius());
            System.out.println("Area: " + myCircle.getArea());
            System.out.println("Circumference: " + myCircle.getCircumference());
            System.out.println("Diameter: " + myCircle.getDiameter());

            scanner.close();
        }
    }

}
