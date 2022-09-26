abstract class Animal {
    abstract void walk(); // abstract cannot be instantiated
    Animal() {  // constructor
        System.out.println("creating a new constructor");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() { // constructor
        System.out.println("created a chicken");
    }
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}


public class Abstraction {
    // abstraction means --> hiding of implementation details and showing only important/ useful parts to the user.
    public static void main(String[] args) {
        
    
    Horse horse = new Horse();
    horse.walk();
    // Animal animal = new Animal();
    // animal.walk();  // cannot be instantiated bcz it is abstract
    Chicken chicken = new Chicken();
    chicken.walk();
    horse.eat();
    chicken.eat();
   
  }
}
