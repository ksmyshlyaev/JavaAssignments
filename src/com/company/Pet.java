package com.company;

public class Pet extends Animal {
    public String name;
    public int tail = 1;
    public int paws = 4;

    public Pet(){
        System.out.println("I am pet");
        this.eyes = 2;
    }

    public void run(){
        System.out.println("Pet runs");
    }

    public void jump(){
        System.out.println("Pet jumps");
    }

}
