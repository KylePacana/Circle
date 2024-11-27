/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacana_kyle_circle;

/**
 *
 * @author Student
 */
public class Circle {
      
    private double radius;

  
    public Circle() {
        this.radius = 1.0; 
    }

   
    public Circle(double radius) {
        this.radius = radius;
    }

 
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

  
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    
    public double getDiameter() {
        return 2 * radius;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

}
