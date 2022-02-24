package com.santidev.safari;

public abstract class Animal {

    //variables de clase
    public int age;
    public float weight;
    public String type;
    public int hungerLevel;

    public void eat(){
        this.hungerLevel--;
    }

    public void walk(){
        this.hungerLevel++;
    }

}

