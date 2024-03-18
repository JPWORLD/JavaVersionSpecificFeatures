                                ### Java Features


### Java 8 Key Features
- **Lambda Expressions:** A new language feature that allows you to treat functionality as a method argument, or code as data.
- **Functional Interfaces:** An interface with only one abstract method, used as the basis for lambda expressions.
- **Method References:** Enable you to call a method by referring to it with the help of its name.
- **Stream API:** Introduced for processing collections and streams of objects in a functional style.
- **Default Methods:** Allow the addition of new methods to interfaces without breaking the existing implementation of these interfaces.
- **Base64 Encode Decode:** Provides utilities for encoding and decoding the Base64 representation.
- **Static Methods in Interface:** Enables defining static methods in interfaces which can be called independently of an object instance.
- **Optional Class:** A container object which may or may not contain a non-null value, used to avoid NullPointerException.
- **Collectors Class:** Provides reduction operations, such as accumulating elements into collections.
- **ForEach() Method:** Enhances the Iterable interface to leverage lambda expressions.
- **Nashorn JavaScript Engine:** A JavaScript runtime which allows developers to embed JavaScript code within applications.
- **Parallel Array Sorting:** Introduces the ability to perform parallel array sorting.
- **Type and Repeating Annotations:** Enhancements to the annotation system.
- **IO Enhancements:** Improvements to the Input/Output APIs.
- **Concurrency Enhancements:** Improvements to concurrent processing.
- **JDBC Enhancements:** Updates to the Java Database Connectivity APIs.

### Java 11 Key Features
- **Local-Variable Syntax for Lambda Parameters:** Allows you to use the var keyword when declaring the formal parameters of implicitly typed lambda expressions.
- **New String Methods:** Methods like isBlank(), lines(), strip(), stripLeading(), stripTrailing(), and repeat() were added to the String class.
- **New File Methods:** Files.writeString() and Files.readString() were introduced to simplify reading and writing strings from and to files.
- **HTTP Client (Standard):** A new HTTP Client API that supports HTTP/2 and WebSocket, which was introduced as an incubator module in Java 9 and standardized in Java 11.
- **Epsilon: A No-Op Garbage Collector:** Useful for performance testing and extremely short-lived jobs.
- **Flight Recorder:** A low-overhead data collection framework for troubleshooting Java applications and the HotSpot JVM.
- **ZGC: A scalable low-latency garbage collector.**
- **Launch Single-File Source-Code Programs:** Enhances the java launcher to run a program supplied as a single file of Java source code.
- **Unicode 10:** Java 11 now supports Unicode 10.
- **Nest-Based Access Control:** Improves the performance of nested class access checks.
- **Dynamic Class-File Constants:** Introduces a new kind of constant pool entry to support dynamic and more efficient computation of constants at runtime.

### Java 17 Key Features
- **Sealed Classes:** Restrict which other classes or interfaces may extend or implement them.
- **Pattern Matching for switch (Preview):** Enhances the switch statement to allow pattern matching.
- **Record Classes:** Makes it easier to create classes that are simple “data carriers”.
- **New macOS Rendering Pipeline:** Implements a new rendering pipeline for macOS using the Apple Metal API.
- **macOS/AArch64 Port:** Adds support for macOS on ARM64 architecture.
- **Foreign Function & Memory API (Incubator):** Introduces an API to allow Java programs to interoperate with code and data outside of the Java runtime.
- **Vector API (Second Incubator):** Provides a way to express vector computations that reliably compile at runtime to optimal vector instructions.
- **Enhanced Pseudo-Random Number Generators:** Introduces new interfaces and implementations for Pseudo-Random Number Generators.
- **Deprecation of the Applet API:** Marks the Applet API for removal as applets are no longer supported by modern browsers.
- **Strong Encapsulation of JDK Internals:** Strongly encapsulates all internal elements of the JDK, except for critical internal APIs such as sun.misc.Unsafe.
- **Removal of the Experimental AOT and JIT Compiler:** Removes the experimental Just-In-Time (JIT) compiler and Ahead-of-Time (AOT) compiler that were part of the Graal project.
- **Removal of the Security Manager:** Deprecates the Security Manager for removal in a future release.