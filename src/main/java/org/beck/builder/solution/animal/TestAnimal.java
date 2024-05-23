package org.beck.builder.solution.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal.AnimalBuilder()
                .name("Amora")
                .owner("Juliana")
                .race("dog")
                .build();

        System.out.println(animal);
    }
}
