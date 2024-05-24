package org.beck.prototype.solution;

import org.beck.prototype.Button;

public class ButtonFactory {
    public static Button getInstance(Button prototype) {
        Button clone = new Button();

        clone.setColor(prototype.getColor());
        clone.setHeight(prototype.getHeight());
        clone.setWidth(prototype.getWidth());
        clone.setBorderType(prototype.getBorderType());

        return clone;
    }
}
