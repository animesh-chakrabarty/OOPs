# Inheritance

## Basics
- Inheritance allows us to create a new class from an existing class.
- The new class that is created is known as sub class/ child class.
- The existing class from where the child class is derived is known as base class/ parent class.

## super Keyword

- super keyword is used to access the instance variable (super.propertyName), methods (super.methodName()) & constructors (super()) of immediate parent class

_IMP: when any contstructor of the child class is invoked the default constructor of the parent class will also be invoked automatically_

## Single Inheritance 
- A sub-class inherits from only one base class.
  
## Multilevel Inheritance
- A sub-class inherits from another sub-class, which itself inherits from a base class.
  
## Hierarchical Inheritance
- Multiple sub-classes inherit from a single base class.

## Multiple Inheritance
- Sub-class inherits from multiple base classes directly.

_IMP: Multiple Inheritance is not supported in java by default. It can be achieved using interfaces_

## Hybrid Inheritance
- Any combination of the above types of inhertances.

## Upcasting
- Converts child object reference to a parent class reference 

```java
class Animal {
  public void makeSound() {
    System.out.println("Generic animal sound");
  }
}

class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Woof!");
  }
}

public class UpcastingExample {
  public static void main(String[] args) {
    Animal myAnimal = new Dog(); // Upcasting - implicit conversion
    myAnimal.makeSound(); // Calls Animal's makeSound() (Generic sound)
  }
}
```
_Here, even though myAnimal is pointing to a Dog object it can only access variables or methods defined by the Animal class as the reference variables type is Animal_

**IMP:**
```java
    Box b2 = new ColoredBox();
    b2.printBoxDimensions();
```

_In the above code, though it might look like as the type of b2 reference variable is Box so the printBoxDimension() of Box class should get executed. But in reality the printBoxDimension() of ColoredBox class will get executed._

_The reason is, when you call a method on an object reference, the method to be invoked is determined at runtime based on the actual object's type (dynamic dispatch or polymorphism). This means even though b2 is a Box reference, since it points to a ColoredBox object, the method call b2.printBoxDimensions() attempts to find the printBoxDimensions() method within the ColoredBox class._

## Downcasting 
- Converts a parent class object reference to a child class reference
  
```java
public class DowncastingExample {
  public static void main(String[] args) {
    Animal myAnimal = new Dog(); // Upcasting

    // Safe downcasting if you know the object is a Dog
    Dog myDog = (Dog) myAnimal; 
    myDog.makeSound(); // Calls Dog's makeSound() (Woof!)

    // Unsafe downcasting (ClassCastException if not a Dog)
    // Animal anotherAnimal = new Animal();  // Create an Animal object
    // Dog unsafeDog = (Dog) anotherAnimal; // Might throw ClassCastException
  }
}
```

## special usecase of super keyword 
```java
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
    //as we can see in this example the parent class(Box) & child class(WeightedBox) both have a instance variable named w. If we want to initialize the w variable of the parent class from the constructor of child class we can't do that using this keyword. We've to use super keyword to refer to the w of the parent class.
    super.w = parent_w;
}
```