import java.io.*;
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age - 2;
    }
}

public class DisplayNameMdee {
    public static void main(String[] args){
        Student std = new Student("Amin", 21);
        System.out.println("Name: " + std.name + " and Age : " + std.age);
    }
}
