package org.beck.factoryMethods.problem;

import org.beck.factoryMethods.DigitalProduct;
import org.beck.factoryMethods.PhysicalProduct;

public class ProductTest {
    public static void main(String[] args) {
        PhysicalProduct physicalProduct = new PhysicalProduct();
        physicalProduct.setHasPhysicalDimensions(true);

        DigitalProduct digitalProduct = new DigitalProduct();
        digitalProduct.setHasPhysicalDimensions(false);
    }
}
