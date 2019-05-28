/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Is_17_1
 */
import java.text.MessageFormat;

public class ColoredRect extends DrawRect {

    private String inColor;
public ColoredRect(int x1, int y1, int x2, int y2, String outColor, String inColor) {
        super(x1, y1, x2, y2, outColor);
        this.inColor = inColor;
    }
     public ColoredRect() {
        this(0, 0, 0, 0, "red","green");
    }
     
    public void draw(String outColor, String inColor) {
        super.draw(outColor);
        this.inColor = inColor;
         System.out.println("Цвет внутрений:  "+inColor);
    }
    
    
}
