# Basics

## Class & Object

- class: class is a blueprint that defines some properties & behaviours(method/function)
- object: object is a instance of class that attaches value to those properties defined by class

_IMP: One file can have multiple classes but only one public class and the name of the public class has to be same as the file name_

_IMP: Execution of java code starts from the main function of the public class_

_IMP: One package can't have two classes of same name_

## Types of variables

- Reference variables:
- instance variables:

```java
public class Car {

  // Instance variables (properties of a Car object)
  String color;
  String model;
  int speed;
}

public class Main {
  public static void main(String[] args) {

    // carRef is an reference variable which stores the reference to an object of class Car
    Car carRef = new Car();
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

```javascript
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