package org.example;

public class Alien {
    private int age;
    private laptop lap;

    public Alien(){
        System.out.println("object created");
    }

    public Alien(int age, laptop lap){
        this.age = age;
        this.lap = lap;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age)
    {
        System.out.println("setter called");
        this.age = age;
    }


    public void code(){
        System.out.println("Coding.!!");
    }
}
