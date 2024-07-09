# Inheritance

- Inheritance allows us to create a new class from an existing class.
- The new class that is created is known as sub class/ child class.
- The existing class from where the child class is derived is known as base class/ parent class.

## Method Overriding

- If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding (runtime polymorphism).

_IMP: for example, if there are 3 classes - A,B,C. C extends B, B extends A. A has a method called print(). B also has a method print(). Now, if class C doesn't have a method named print() but it's object calls print() the print() method of B class will be executed because B is the immediate parent of C which has print() method_

_IMP: Every class in java is inherited from Object class_

## super Keyword

- super keyword is used to access the instance variable (super.propertyName), methods (super.methodName()) & constructors (super()) of immediate parent class

_IMP: when any contstructor of the child class is invoked the default constructor of the parent class will also be invoked automatically_