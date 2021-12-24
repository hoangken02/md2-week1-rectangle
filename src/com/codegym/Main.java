package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double width;
        double height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your width: ");
        width = scanner.nextDouble();
        System.out.println("Enter your height: ");
        height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.toString());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}

