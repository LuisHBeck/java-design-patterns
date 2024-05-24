package org.beck.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Button {
    protected String color;
    protected int width;
    protected int height;
    protected BorderType borderType;
}
