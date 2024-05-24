package org.beck.prototype.problem;

import org.beck.prototype.BorderType;
import org.beck.prototype.Button;

public class BlueButton extends Button {
    public BlueButton() {
        setColor("Blue");
        setHeight(35);
        setWidth(125);
        setBorderType(BorderType.DASHED);
    }
}
