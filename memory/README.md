## Memory

_IMP: Memory for objects are allocated during run-time_

- Metaspace: Metaspace is used to store the metadata (properties & methods) of the classes
- Stack: The reference variable of objects are stored in stack memory
- Heap: The actual object is stored in heap memory

## Stack memory
- Stack memory is where the primitive data types and the reference variables to the objects are stored
- Stack memory is short lived
- Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method. As soon as the method execution ends, the block in the heap memory is destroyed. 

## Heap memory
- Heap memory is where the actual object is stored along with its instance variables. Non-primitive data types are also stored in heap memory
  
_IMP: The primary work of garbage collector is to collect garbage from heap memory_

_IMP: stack memory size is very less compared to heap memory_

_IMP: each thread has its own stack memory. But the heap memory is shared between all the threads_

## Garbage collector
- Garbage collector erases those memory blocks in heap memory which doesn't have any reference variable pointing to it in the stack memory

## String pool
- String pool is a special storage area in java heap memory where strings are stored to improve memory usage and performance 