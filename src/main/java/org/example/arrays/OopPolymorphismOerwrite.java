package org.example.arrays;

interface Draw{
    public String draw();
}

abstract class AbstractArt implements Draw{
    public String draw(){
        return "drawing interface art";
    }

    public String drawAbsArt(){
        return "Abstarct art is drawn";
    }

//    public abstract String makeSome();
}

class DrawNano extends AbstractArt implements Draw{
    public String draw() {
        return  "drawing Nano";
    }
    public String drawAbsArt(){
        return "Abstarct art is drawn from Nano";
    }
}

class DrawMg implements Draw{
    public String draw() {
        return  "drawing Mg";
    }
}

public class OopPolymorphismOerwrite {
    public static void main(String[] args) {
        DrawNano nanoObj = new DrawNano();
        DrawMg drawMg = new DrawMg();
        System.out.println(nanoObj.draw());
        System.out.println(nanoObj.drawAbsArt());
        System.out.println(drawMg.draw());
    }
}