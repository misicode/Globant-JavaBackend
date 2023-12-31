package com.misicode._05Inheritance.Exercises.P104;

import com.misicode._05Inheritance.Exercises.P104.entities.Circle;
import com.misicode._05Inheritance.Exercises.P104.entities.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(4, 2.5);

        System.out.println("CÍRCULO");
        System.out.println("Área: " + circle.calculateArea());
        System.out.println("Perímetro: " + circle.calculatePerimeter());

        System.out.println("\nRECTÁNGULO");
        System.out.println("Área: " + rectangle.calculateArea());
        System.out.println("Perímetro: " + rectangle.calculatePerimeter());
    }
}
