package org.beck.prototype.solution;

import org.beck.prototype.BorderType;
import org.beck.prototype.Button;

public class ButtonPrototypeTest {
    public static void main(String[] args) {
        Button blueButton = ButtonRegistry.getButton("BLUE_BTN");
        System.out.println(blueButton);

        Button redButton = ButtonRegistry.getButton("RED_BTN");
        System.out.println(redButton);

        Button blackBtn = new Button();
        blackBtn.setColor("black");
        blackBtn.setHeight(56);
        blackBtn.setWidth(789);
        blackBtn.setBorderType(BorderType.BOLD);
        ButtonRegistry.addRegistry("BLACK_BTN", blackBtn);

        blackBtn = ButtonRegistry.getButton("BLACK_BTN");
        System.out.println(blackBtn);
    }
}
