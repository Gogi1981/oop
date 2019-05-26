/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Гоги
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rectangle1 = new Rectangle(10, 20, -4, -9);
        Rectangle rectangle2 = new Rectangle(10, 20);
        Rectangle rectangle3 = new Rectangle();

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

        rectangle2.move(4, -8);
        System.out.println(rectangle2);

        System.out.println(rectangle1.minSquare(rectangle2));

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Введите цвет и нажмите Enter: ");
            String in = s.next();
            System.out.print("Введите цвет и нажмите Enter: ");
            String out = s.next();
            ColoredRect coloredRect = new ColoredRect();
            coloredRect.draw(in, out);
            System.out.println(coloredRect);
        }
    }
    
}
