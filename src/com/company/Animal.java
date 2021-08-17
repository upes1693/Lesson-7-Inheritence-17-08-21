package com.company;

//This is our base classes that animals will inherit
public class Animal {
    private String name;
    private int size;
    public int weight;
    private int age;

    public Animal(){

    }

    public Animal(String name, int size, int weight, int age) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.age = age;
        System.out.println("Animal ctor");
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }

    public String makeSound(){
        return "";
    }
}
