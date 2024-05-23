package org.beck.factoryMethods;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
    private String description;
    private BigDecimal price;
    private Boolean hasPhysicalDimensions;
}
