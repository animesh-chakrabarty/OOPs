## polymorphism
- method overriding: run-time polymorphism
- method overloading: compile-time polymorphism

## Method Overloading

Two or more methods can have the same name inside the same class if they accept different arguments.

_IMP: If we change only the return type of the method that won't work if both methods have same no. of arguments or the arguments are of same data type_

## Method Overriding

- If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding (runtime polymorphism).

_IMP: for example, if there are 3 classes - A,B,C. C extends B, B extends A. A has a method called print(). B also has a method print(). Now, if class C doesn't have a method named print() but it's object calls print() the print() method of B class will be executed because B is the immediate parent of C which has print() method_

_IMP: Every class in java is inherited from Object class_