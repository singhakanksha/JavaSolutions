package org.example.arrays;

public class ExampleSingleton {
    private static ExampleSingleton single_instance = null;
    public String s;
    private ExampleSingleton(){
        s = "hello" ;
    }
    public static synchronized ExampleSingleton getInstance(){
        if(single_instance ==null){
            single_instance = new ExampleSingleton();
        }
        return single_instance;
    }
}

class run{
    public static void main(String[] args) {
        ExampleSingleton obj = ExampleSingleton.getInstance();
        ExampleSingleton obj1 = ExampleSingleton.getInstance();
        System.out.println(obj.s);
        obj.s = obj.s.toUpperCase();
        System.out.println(obj.s);
        System.out.println(obj.s);
    }
}