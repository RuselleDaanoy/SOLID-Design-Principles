# SOLID-Design-Principles

This repository contains examples demonstrating the SOLID principles of object-oriented programming. Each principle is implemented in Java to provide clear and practical illustrations for developers who want to write maintainable and scalable software.

# 📖 Contents
- Single Responsibility Principle (SRP)
- Open/Closed Principle (OCP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)

Each principle is organized into separate folders and files, showcasing how to adhere to the principles in Java.


1. Single Responsibility Principle (SRP)
The Single Responsibility Principle (SRP) states that a class should only have one reason to change. Each class should focus on a single responsibility or functionality.

Folder: /single-responsibility-principle/
Example: Separation of Pet and Owner classes to handle pet-specific and owner-specific attributes.

2. Open/Closed Principle (OCP)
The Open/Closed Principle (OCP) states that software entities should be open for extension but closed for modification. This ensures that new behavior can be added without altering existing code.

Folder: /open-close-principle/
Example: Implementation of various discount strategies (StudentDiscount, SeniorDiscount, RegularDiscount) using polymorphism.

3. Interface Segregation Principle (ISP)
The Interface Segregation Principle (ISP) states that no client should be forced to depend on methods it does not use. This is achieved by creating smaller, more specific interfaces.

Folder: /interface-segregation-principle/
Example: Splitting phone functionalities (Call, Sms, Camera, WebBrowsing) into separate interfaces to prevent unnecessary dependencies.

4. Dependency Inversion Principle (DIP)
The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules; both should depend on abstractions. Abstractions should not depend on details, and details should depend on abstractions.

Folder: /dependency-inversion-principle/
Example: Decoupling PaymentProcessor from specific payment methods (EWallet, CreditCard, Cash) using the Payment interface.