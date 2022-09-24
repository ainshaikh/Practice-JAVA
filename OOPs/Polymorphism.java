// package OOPs;


class Student {
    String name;
    int age;

    public void printInfo(String name) { // same function when used for different purposes many times called polymorphism.

        // Compile-time polymorphism is a polymorphism that is resolved during the compilation process. Overloading of methods is called through the reference variable of a class.

        // Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name +" "+ age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        

        Student s1 = new Student();
        s1.name = "ain";
        s1.age = 22;

        s1.printInfo(s1.name, s1.age);

    }
}
