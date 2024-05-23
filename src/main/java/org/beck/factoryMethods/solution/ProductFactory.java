package org.beck.factoryMethods.solution;

import org.beck.factoryMethods.DigitalProduct;
import org.beck.factoryMethods.PhysicalProduct;
import org.beck.factoryMethods.Product;
import org.beck.factoryMethods.ProductType;

public class ProductFactory {

    /*
     * static factory method or virtual constructor
     * getInstance method is responsible to return instance of superclass
     * apply default business rules at instance creation
     */

    public static Product getInstance(ProductType productType) {
        switch (productType) {
            case PHYSICAL:
                PhysicalProduct physicalProduct = new PhysicalProduct();
                physicalProduct.setHasPhysicalDimensions(true);
                return physicalProduct;

            case DIGITAL:
                DigitalProduct digitalProduct = new DigitalProduct();
                digitalProduct.setHasPhysicalDimensions(false);
                return digitalProduct;

            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}
