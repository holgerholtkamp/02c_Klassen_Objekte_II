package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;
   
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    /** Getter */
    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return name; 
            case "#furColor":
                return furColor; 
            default:
                return "ERROR: ???";
        }
    }

    public int getAge() {
        return age;
    }


}

