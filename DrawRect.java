/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Is_17_1
 */
import java.text.MessageFormat;

public class DrawRect extends Rectangle {

    private String outColor;
    
     public DrawRect(int x1, int y1, int x2, int y2, String outColor) {
        super(x1, y1, x2, y2);
        this.outColor = outColor;
    }
     public DrawRect() {
        this(0, 0, 0, 0, "red");
    }

    public void draw(String outColor) {
        System.out.println(super.toString());
        this.outColor = outColor;
        System.out.println("Цвет границы: "+outColor);
    }

     
}

