package org.beck.factoryMethods.solution;

import org.beck.factoryMethods.Product;
import org.beck.factoryMethods.ProductType;

public class ProductTestWithFactoryMethod {
    public static void main(String[] args) {
        Product digitalProduct = ProductFactory.getInstance(ProductType.DIGITAL);
        System.out.println(digitalProduct);

        Product physicalProduct = ProductFactory.getInstance(ProductType.PHYSICAL);
        System.out.println(physicalProduct);
    }
}
