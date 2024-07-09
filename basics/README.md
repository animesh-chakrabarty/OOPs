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

## Memory

_IMP: Memory for objects are allocated during run-time_

- Metaspace: Metaspace is used to store the metadata (properties & methods) of the classes
- Heap: The actual object is stored in heap memory
- Stack: The reference variable of objects are stored in stack memory

## Method Overloading

Two or more methods can have the same name inside the same class if they accept different arguments.

_IMP: If we change only the return type of the method that won't work if both methods have same no. of arguments or the arguments are of same data type_

## Constructor

- It is a block of code similar to method. It is called when an object is created

- If a class doesn't have a constructor, Java compiler creates a default constructor during run-time. The default constructor initializes the instance variables with the default values

_IMP: If any constructor is defined in the class, the default constructor provided by the compiler will be inaccessible_

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
