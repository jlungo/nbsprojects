import java.io.*;
class Student {
    String name;
    int age;
    Student (String name, int age)
    { 
        this.name = name;
        this.age = age -2;
    }
}
class DisplayName {
    public static void main(String [] args){
        Student std = new Student("Amina", 21);
        System.out.println("Name: " + std.name + " and Age: " + std.age);
    }
}

      
      