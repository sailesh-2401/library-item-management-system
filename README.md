Library Item Management System
A robust Java Console Application designed to manage various library resources including Books, Magazines, and DVDs. This project serves as a practical demonstration of Object-Oriented Programming (OOP) principles such as Inheritance, Polymorphism, and Encapsulation.

Key Features:-
-> Hierarchical Data Model: Utilizes a base LibraryItem class with specialized child classes.
-> Dynamic Inventory: Uses the Java Collections Framework (List) to store and manage items.
-> Polymorphic Behavior: Implements method overriding to display item-specific details dynamically at runtime.
-> Access Control: Demonstrates the use of private, protected, and default access modifiers to secure data.

Project Structure:-
-> The project is organized into logical packages to maintain a clean separation of concerns:
-> com.library.model: Contains the core entities (Book, Magazine, DVD).
-> com.library.service: Contains the business logic for managing the library collection.
-> com.library.app: The entry point containing the Main class.

Technical Concepts Demonstrated:-
1. Inheritance & Abstraction
The LibraryItem class is declared as abstract to prevent the instantiation of generic items, acting as a blueprint for concrete types.

2. Polymorphism
The system manages a List<LibraryItem>, allowing different object types (Books, DVDs) to be processed through a single unified interface.

4. Encapsulation
Data is protected using appropriate access modifiers, ensuring that internal state is only modified through controlled methods.

*How to Run*
->Clone the repository:
git clone https://github.com/your-username/library-item-management-system.git

Navigate to the src directory.

->Compile the files:
javac com/library/app/LibraryApp.java

->Run the application:
java com.library.app.LibraryApp
