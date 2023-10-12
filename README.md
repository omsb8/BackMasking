# BackMasking

This is a Java project that involves implementing two classes, `ArrayStack` and `ListStack`, to create stack data structures.
These classes provide the functionality to push, pop, peek, check if the stack is empty, and count the number of elements in the stack.
While the main focus of these classes is to demonstrate stack data structure implementations, the project also involved applying them to reverse audio data.

## Project Background

The "BackMasking" project started with the goal of reversing audio data in the `.dat` format, specifically, audio data obtained from `.wav` files. The process was structured into several steps:

1. **Convert `.wav` to `.dat`**: The project started by converting audio data from `.wav` files to `.dat` files using a tool like SoX (Sound eXchange). This conversion was essential to obtain audio data in a format suitable for manipulation.

2. **Reverse Audio Data**: The core of this project involved reversing the audio data contained within the `.dat` files. This was accomplished using two Java classes, `ArrayStack` and `ListStack`. These classes implemented a stack data structure that allowed for efficient reversal of the data.

3. **Convert Back to `.wav`**: After successfully reversing the audio data within the `.dat` files, the final step involved converting these reversed data files back to the `.wav` format. This step was crucial for testing the correctness of the reversal process and ensuring that the audio data remained intact and audible.

## `ArrayStack` and `ListStack` Classes

### ArrayStack

`ArrayStack` is an implementation of a stack data structure using an array. It supports the following methods:

- `push(double value)`: Pushes a new value onto the stack.
- `pop()`: Pops and returns the top element from the stack.
- `peek()`: Returns the top element without removing it.
- `isEmpty()`: Checks if the stack is empty.
- `count()`: Returns the number of elements in the stack.

The stack automatically resizes when it reaches its capacity to accommodate a growing number of elements.

### ListStack

`ListStack` is an implementation of a stack data structure using a singly linked list. This class also implements the `Iterable` interface, which allows iteration over the stack elements.

- `push(double value)`: Pushes a new value onto the stack.
- `pop()`: Pops and returns the top element from the stack.
- `peek()`: Returns the top element without removing it.
- `isEmpty()`: Checks if the stack is empty.
- `count()`: Returns the number of elements in the stack.
- `iterator()`: Returns an `Iterator` object to iterate over the elements.
  - The `Iterator` is implemented as a private inner class, `ListStackIterator`, to allow for traversal of the linked list.

## Usage

These stack implementations provide a basic understanding of how stacks work and how they can be implemented using arrays or linked lists. You can use these classes as-is or adapt them to your specific needs within your Java applications. The code includes error handling, resizing for arrays, and iteration over elements in the linked list, making it more robust for practical use.

You can utilize these classes within your Java applications for various purposes, including reversing and manipulating data efficiently. After the reversal process, you can convert the reversed data back to `.wav` format for further analysis, testing, or other audio processing tasks.

## Note

Please note that these classes are designed to provide a basic understanding of how stacks work and how they can be implemented using arrays or linked lists. You can adapt and extend these classes as needed to suit your specific project requirements. This README serves as an overview of the project's objectives, the purpose of the stack implementations, and their application to audio data processing in the "BackMasking" project.
