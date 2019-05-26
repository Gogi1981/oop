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

public class DrawRect extends Rectangle {

    private String outColor;

    public void draw(String outColor) {
        this.outColor = outColor;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, out: {1}", super.toString(), outColor);
    }
}
