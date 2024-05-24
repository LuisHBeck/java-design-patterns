package org.beck.prototype.solution;

import org.beck.prototype.BorderType;
import org.beck.prototype.Button;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ButtonRegistry {
    private static Map<String, Button> REGISTRY = new HashMap<>();

    /*
     * this code block was execute
     * at class initialization
     */
    static {
        Button redBtn = new Button();
        redBtn.setColor("red");
        redBtn.setHeight(30);
        redBtn.setWidth(100);
        redBtn.setBorderType(BorderType.SLIM);
        REGISTRY.put("RED_BTN", redBtn); // registry

        Button blueBtn = new Button();
        blueBtn.setColor("Blue");
        blueBtn.setHeight(35);
        blueBtn.setWidth(125);
        blueBtn.setBorderType(BorderType.DASHED);
        REGISTRY.put("BLUE_BTN", blueBtn); // registry
    }

    /*
     * apply singleton pattern
     */
    private static ButtonRegistry buttonRegistry = null;
    public static ButtonRegistry getInstance() {
        if(Objects.isNull(buttonRegistry)) buttonRegistry = new ButtonRegistry();
        return buttonRegistry;
    }

    public static Button getButton(String key) {
        return ButtonFactory.getInstance(REGISTRY.get(key));
    }

    public static void addRegistry(String key, Button button) {
        REGISTRY.put(key, button);
    }
}
