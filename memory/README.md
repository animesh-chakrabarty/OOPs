## Memory

_IMP: Memory for objects are allocated during run-time_

- Stack: Primitive variables & reference variables of objects are stored in stack memory
- Heap: The actual object is stored in heap memory
- Metaspace: Metaspace is used to store the metadata (properties name, type, access modifiers & methods name, return types, parameter types, access modifiers) of the classes

_Before java8, the similar memory space of metaspace was permgen_

## Stack memory
- Stack memory is where the primitive data types and the reference variables to the objects are stored
- Stack memory is short lived
- Whenever a method is invoked, a new block(stack frame) is created in the stack memory for the method to hold local primitive values and reference to other objects in the method. As soon as the method execution ends, the stack frame in the heap memory is destroyed. 

## Stack Frame / activation record
- Stack frame is a data structure created inside the call stack for every method invocation. It holds info related to the execution of the method such as local variables, reference to objects created inside that method. 

## Heap memory
- Heap memory is where the actual object is stored along with its instance variables. Non-primitive data types are also stored in heap memory
  
_IMP: The primary work of garbage collector is to collect garbage from heap memory_

_IMP: stack memory size is very less compared to heap memory_

_IMP: each thread has its own stack memory. But the heap memory is shared between all the threads_

## Garbage collector
- Garbage collector erases those memory blocks in heap memory which doesn't have any reference variable pointing to it in the stack memory

## String pool
- String pool is a special storage area in java heap memory where strings are stored to improve memory usage and performance 

## Explanation with example 
```java
public class MemoryExample {
    public static void main(String[] args) {
        int a = 10; // Stack memory allocation
        int b = 20; // Stack memory allocation
        
        MemoryExample example = new MemoryExample(); // Heap memory allocation
        example.calculateSum(a, b); // Stack memory for method call
    }
    
    public void calculateSum(int x, int y) {
        int sum = x + y; // Stack memory allocation
        System.out.println("Sum: " + sum);
    }
}

```
**Explanation:**

**1. Main Method Execution:**

- `int a = 10;` and `int b = 20;`: `a` and `b` are primitive variables, so they are stored in the stack frame of the main method.
- `MemoryExample example = new MemoryExample();`: example is a reference variable stored in the stack, while the actual MemoryExample object is allocated in the heap.

**2. calculateSum Method Execution:**
- When `calculateSum(a, b)` is called, a new frame is created in the stack for this method.
- `int x and int y`: These parameters are passed by value, and they are stored in the stack frame of the calculateSum method.
- `int sum = x + y;`: The sum variable is also stored in the stack frame of the calculateSum method.
- When the calculateSum method finishes execution, its stack frame is removed, and the memory is deallocated.

**3. Heap Memory:**
- The `example` object remains in the heap until it is no longer referenced and is eventually garbage collected.