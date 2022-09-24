// package OOPs;

class Pen{

    String color;
    String type; // ball point

    public void write(){   // functions that are defined in a class is called   Method

        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);   //"this" is a keyword of java that tells ki is function ko kis object ne call kiya h
    }

}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student() {  // 1st type of constructor non parameterized
    //     System.out.println("constructor called");
    // }
    // Student(String name, int age){ // parametrized constructor
    //     this.name = name;
    //     this.age = age;
    // }

    Student(Student s2){ // copy paste constructor 3rd wali
        this.name = s2.name;
        this.age = s2.age;
    }
    Student() {
        // empty constructor defined for 3rd copy paste
    }




}
public class objectClassesConstructorandthis {  // main function comes under public class
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue"; // property accessed
        // pen1.type = "gel";

        // pen1.write();  //method is called

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();

        // Student s1 = new Student();
       
        // Student s1 = new Student("Ain", 26); // NOTE-- a constructor name and a class name should be the same, never return anything, once called for every one object
        //   
        // a special type function that is constructor-----3types
        // 1---> Non parametrized----has no parameters  
        // 2---> Parametrized--has parametres
        // 3---> Copy constructor--> copy one object and paste in other object


        // s1.name = "Ain";
        // s1.age  = 26;

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 21;

        Student s2 = new Student(s1);
        s2.printInfo();
        





        // s1.printInfo();

    }
    
}
