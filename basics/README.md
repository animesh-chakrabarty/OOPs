# Basics

## Class & Object
- class: class is a blueprint that defines some properties & behaviours(method/function)
- object: object is a instance of class that attaches value to those properties defined by class

_IMP: One file can have multiple classes but only one public class and the name of the public class has to be same as the file name_

_IMP: Execution of java code starts from the main function of the public class_

## Memory 
_IMP: Memory for objects are allocated during run-time_
- Metaspace: Metaspace is used to store the metadata (properties & methods) of the classes
- Heap: The actual object is stored in heap memory
- Stack: The reference variable of objects are stored in stack memory

## Method Overloading
Two or more methods can have the same name inside the same class if they accept different arguments. 

_IMP: If we change only the return type of the method that won't work if both methods have same no. of arguments or the arguments are of same data type_