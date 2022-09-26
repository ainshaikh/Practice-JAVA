interface Animal {
    void walk(); // all the fields in interfaces are public, static and final by default.
    // all methods are public and abstract by default.
    // Animal(){
    //}           // interfaces cannot have constructors and no non abstract functions.

}

interface Herbivore {

}

class Horse implements Animal, Herbivore  { //two classes can also be //    implemenmted together  // in interface we use implement to extends
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}


public class InterfacesAbstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
