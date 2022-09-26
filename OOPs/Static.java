class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school = "newschool";  // school name will be changed for all students at once
    }
}
public class Static {
    public static void main(String[] args) {
        Student.school = "DPMS";
        Student.school = "DPS"; 
           // static method and static variable can be called with class name....no need of object creation.

        Student student1 = new Student();
        student1.name = "ain";
        System.out.println(student1.school);
    }
}
