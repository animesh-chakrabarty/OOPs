## Basics
- [x] Class
- [x] Object 
- [x] Reference variable 
- [x] Instance variable
- [x] Role of stack & heap memory - memory 
- [x] constructor 
- [x] package
- [x] import statement
- [x] this 
- [x] final 
- [x] static 

## Inheritance
- [x] inheritance
- [x] super()
- [x] why only l,b,h can be accessed with the object b2 in the below code 
` Box b2 = new WeightedBox(4, 5, 8, 90)`
- [x] why this is giving error
` WeightedBox b2 = new Box(4, 5, 8, 90)`
- [x] single inheritance
- [x] multilevel inheritance
- [x] hierarchical inheritance
- [x] multiple inheritance (not supported in java)
- [x] hybrid inheritance (not suppported in java)
- [x] upcasting
- [x] downcasting

## Polymorphism
- [x] polymorphism 
- [x] compile-time / static polymorphism - method overloading
- [x] run-time / dynamic polymorphism - overriding
- dynamic method dispatch

- encapsulation
- access modifiers : public, private, protected 
- abstraction 
- built-in packages

- every class is inherited from object class
## Inheritance
- child class can call the constructors of parent class using the super() keyword
- child classes can't access private entities of the parent class if the sub class is not defined in the same file

## special usecase of super keyword 
```python
public class Box {
    int l;
    int b;
    int h;
    int w;
}

public class WeightedBox extends Box{
    int w;
}

WeightedBox(int l, int b, int h, int w, int parent_w){
    this.l = l;
    this.b = b;
    this.h = h;
    this.w = w;
    # as we can see in this example the parent class(Box) & child class(WeightedBox) both have a instance variable named w. If we want to initialize the w variable of the parent class from the constructor of child class we can't do that using this keyword. We've to use super keyword to refer to the w of the parent class.
    super.w = parent_w;
}
```

## Built in packages
- lang : java language specific classes (operation, primitves etc) 
- io : input/output classes
- util :  data structures, collection framework
- applet
- awt
- net : networking related classes