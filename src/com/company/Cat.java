package com.company;

public class Cat extends Pet {

    public Cat (String name){
        System.out.println("I am cat and my name is "+name);
    }

    public void sleep(){
        System.out.println("Cat sleeps");
    }
}

class Test{
    public static void main(String[] args) {
        Dog dog = new Dog("Trezor");
        System.out.println(dog.paws);
        Cat cat = new Cat("Barsik");
        cat.sleep();
    }
}
