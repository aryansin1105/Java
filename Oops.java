import java.util.*;
import bank;

//single level inheritance
class Shape{
    String color;
}
class Triangle extends Shape{
    public void showColor(){
        System.out.println(color);
    }
}
//mutli-level inheritance
class Equialateral extends Triangle{
    public void showProperty(){
        System.out.println("Equilateral Traingle");
    }
}
//hybrid inheritance
class Rectangle extends Shape{
    public void showColor(){
        System.out.println(color);
    }
}
// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("writing something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }
// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     //constructor
//     // Student(String name,int age){
//     //     this.name = name;
//     //     this.age = age;
//     // }

//     //in java copy constructor are defined by user
//     // Student(Student s2){
//     //     this.name = s2.name;
//     //     this.age = s2.age;
//     // }
//     // Student(){
//     //     //pass
//     // }
// }

//abstract - khayal or blueprint class
// abstract class Animal{
//     abstract void walk();
//     public void eat(){
//         System.out.println("Animal eat");
//     }
// }
// class Horse extends Animal{
//     public void walk(){
//         System.out.println("walk on 4 leg");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walk on 2 leg");
//     }
// }

//interface don't have constructor or not abstract methods
interface Animal{
    void walk();
}
interface Herbivore{
    //pass
}
//multiple inheritance are implemented by interfaces
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("walk on 4 leg");
    }
}
public class Oops {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Red";
        // pen1.type = "Ball";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Blue";
        // pen2.type = "Ball";

        // pen1.printColor();
        // pen2.printColor();
    
        // Student s1 = new Student();
        // s1.name = "Aman";
        // s1.age = 18;

        // // s1.printInfo();

        // Student s2 = new Student(s1);
        // s2.printInfo();

        //inheritance
        // Triangle t1 = new Triangle();
        // t1.color = "Red";
        // t1.showColor();
        // Equialateral e = new Equialateral();
        // e.showProperty();
        // Rectangle r = new Rectangle();
        // r.color = "Blue";
        // r.showColor();

        // bank.Bank b = new bank.Bank();
        // b.name = "Union";
        
        Horse horse = new Horse();
        horse.walk();
        // horse.eat();

    }
}
//constructor chaining is called in inheritance 