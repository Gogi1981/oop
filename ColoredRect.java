/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Гоги
 */
import java.text.MessageFormat;

public class ColoredRect extends DrawRect {

    private String inColor;

    public void draw(String outColor, String inColor) {
        draw(outColor);
        this.inColor = inColor;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, in: {1}", super.toString(), inColor);
    }

}
