// package OOPs;
import java.util.*;
import Bank;

class Shape {  // base class
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape {  //sub class 
    // 4 types inheritane
    // 1-->single level inheritene

    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }


}


// multi level inheritance

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }

}

// hierarchial inheritance

// Hybrid inheritance



public class Inheritence {
    public static void main(String[] args) {
    
    //     Triangle t1 = new Triangle();
    //     t1.color = "red";
    //     System.out.println(t1.color);
    

    }

}
