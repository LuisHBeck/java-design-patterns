package org.beck.prototype.problem;

import org.beck.prototype.BorderType;
import org.beck.prototype.Button;

public class RedButton extends Button {
    public RedButton() {
        setColor("Red");
        setHeight(30);
        setWidth(100);
        setBorderType(BorderType.SLIM);
    }
}
