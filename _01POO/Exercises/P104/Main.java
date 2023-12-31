package com.misicode._01POO.Exercises.P104;

import com.misicode._01POO.Exercises.P104.entities.Rectangle;
import com.misicode._01POO.Exercises.P104.services.RectangleService;

public class Main {
    public static void main(String[] args) {
        RectangleService rectangleService = new RectangleService();
        Rectangle rectangle = rectangleService.createRectangle();

        System.out.println(rectangle);
        System.out.println("Superficie: " + rectangleService.calculateArea(rectangle));
        System.out.println("Perímetro: " + rectangleService.calculatePerimeter(rectangle));
        System.out.println("Dibujo:");
        System.out.println(rectangleService.drawRectangle(rectangle));
    }
}
