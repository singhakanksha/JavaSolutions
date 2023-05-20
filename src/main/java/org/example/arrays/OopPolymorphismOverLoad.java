package org.example.arrays;

public class OopPolymorphismOverLoad {
    public void draw(){
        System.out.println("drawing empty");
    }
    public void draw(String p1, String p2){
        System.out.println("drawing " + p1 + " " + p2 );
    }
    public void draw(String p1, String p2, String p3){
        System.out.println("drawing " + p1 + " " + p2 + " " + p3 );
    }

    public static void main(String[] args) {
        OopPolymorphismOverLoad obj = new OopPolymorphismOverLoad();
        obj.draw("tomoate", "potatoe", "ladyfinger");
    }
}


