# Basics

_In java, the java compiler first converts the code we write into byte code that the machine understands. Then the byte is executed into JVM_

## Platform Independent Behaviour
_We can share byte code of any java program to someone else and they can also run the same code in their own machine (if JRE is installed). That's why java is platform independent_ 

## JVM, JRE & JDK
- **JVM (Java Virtual Machine)** : A virtual machine that executes Java bytecode, enabling Java programs to run on any device or operating system that has a JVM.
- **JRE (Java Runtime Environment)** : Includes the JVM along with core libraries and other components necessary to run Java applications, such as in-built packages.
- **JDK (Java Development Kit)** : A full-featured software development kit that includes the JRE, a Java compiler, and other development tools needed to write, compile, and debug Java applications.

_So in short_,
- **JVM**: Virtual Machine which executes java byte code 
- **JRE**: JVM + core libraries 
- **JDK**: JRE + java compiler + other development tools

## Class & Object

- class: class is a blueprint that defines some properties(instance variables) & behaviours(method/function)
- object: object is a instance of class that attaches value to those properties defined by class

_IMP: One file can have multiple classes but only one public class and the name of the public class has to be same as the file name_

_IMP: Execution of java code starts from the main function of the public class_

_IMP: One package can't have two classes of same name_

## Types of variables

- **Reference variables**: An instance variable is a variable that is declared in a class, but outside of any method, constructor, or block. Each instance (object) of the class has its own copy of the instance variable.
- **instance variables**: A reference variable is a variable that holds the memory address (or reference) of an object, rather than the object itself. In Java, all object variables are reference variables.

Example:
```java
class Car {
    String model;    // Instance variable
    int year;        // Instance variable
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();  // here, car1 is Reference variable
        car1.model = "Tesla";
        car1.year = 2020;

        Car car2 = new Car();  // here, car2 is another Reference variable
        car2.model = "Ford";
        car2.year = 2018;

        System.out.println("Car 1: " + car1.model + ", Year: " + car1.year);  // Outputs: Car 1: Tesla, Year: 2020
        System.out.println("Car 2: " + car2.model + ", Year: " + car2.year);  // Outputs: Car 2: Ford, Year: 2018
    }
}
```

## Constructor

- It is a block of code similar to method. It is called when an object is created

- If a class doesn't have a constructor, Java compiler creates a default constructor during run-time. The default constructor initializes the instance variables with the default values

_IMP: If any constructor is defined in the class, the default constructor provided by the compiler will be inaccessible_

## Package
- Package acts like a hierarchical folder system for organizing classes, interfaces, and even other sub-packages. 

_IMP: the first line of any java file must be the package where the file is located_

## import statement
- import statement is used to import variable, method or classes from a different package 

_IMP: import statement is written directly after the package statement and before the class definition_

## this keyword

- this keyword is used to refer to the current object inside a method or a constructor

_IMP: this can also be used to invoke methods of the current class or to invoke a constructor of the current class_

- this keyword can be used to pass or return the current object to another method

```java
class Box{
    int l;
    int b;

    void passBoxToAnotherMethod(){
        system.out.println(this.l + " " + this.b);
        ColoredBox cb = new ColoredBox();
        cb.anotherMethod(this);
    }

    Box returnBox(){
        return this;
    }
}

class ColoredBox{
    int color;

    void anotherMethod(Box b){
        system.out.println(this.color);
    }
}
```

_IMP: if super() or this() is needed inside a constructor then it must be the first statement in the constructor_

## final keyword
- final keyword is a non-access modifier that is used to define entities that cannot be changed or modified.
1. final variable: variable with final keyword cannot be assigned again. It's value should be intialized during declaration.
2. final method: method with final keyword cannot be overriden by its subclass
3. final class: class with final keyword can't be extended or inherited from other classes

## static keyword
- if we want to access class members without creating an instance of the class, we need to declare the class members static.
- static variables can be accessed by calling the class name of the class. There is no need to create an instance of the class for acccessing the static variables because static variables are the class variables and are shared among all the class instances. 
- Only a single copy of the static variable is created and shared among all the instances of the class.
- Because it is a class-level variable, memory allocation of such variables only happens once when the class is loaded in the memory.
- If an object modifies the value of a static variable, the change is reflected across all objects.
- Static variables can be used in any type of method: static or non-static.
- Non-static variables cannot be used inside static methods. It will throw a compile-time error.
- static methods can be accessed without creating a object of that class