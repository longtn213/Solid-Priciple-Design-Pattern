"# Solid-Priciple-Design-Pattern" 
"# Solid-Priciple-Design-Pattern" 
Why we do need to use Design Patterns ? => Make software design more understandable and maintainable.
Motivate behind SOLID principles : During Software developement there will be several changes and updates  

Design Principles 
	- Design Principles (Such as SOLID principles) are high level guidelines to design resable software applications
	- pure abstractions - without implementation or programming language 
	- They can be applies in any programming languages
	- These principles are platform independent

SOLID Principle : 5 Principle : tất cả nguyên tắc đi chung với nhau => Khi vi phạm 1 nguyên tắc cũng có thể đã vi phạm những nguyên tắc khác => Không vi phạm bất kì nguyên tắc nào
	+) SINGLE RESPONSIBLE PRINCIBLE : Every class (or method) in a computer program should have responsbility over a single part of that program's functionality, which it should encapsulate
		- Every single software entity (class or method) should have only a single reason to change
		- If a given class( or method) does multiple operations then it is advisable to sperate into district classes (or methods)
		- It can be done easily with the help of interfaces
		
	+) OPEN-CLOSED PRINCIBLE : Software entities should be open for extension , but closed for modification ( WE SHOULD KEEP AS MUCH EXISTING CODE UNCHANGED AS POSSIBLE)
		- States that the design and writing of the code should be done in a way that new functionality should be added with minimum changes in the existing code
		- Software entities should be open for extension , but closed for modification
		- We have to design every new module such that if we add a new behavior then we do not have to change the existing code (Closely related to single responsbility principle)
		- A Class should not extend an other class explicity - we should define a common interface instead
		- We can change the classes at runtime due to the common interface
		- 2 Important design pattern that can guarantee that the open closed principle is not violated : 
			* Strategy pattern
			* Template pattern

	+) LISKOV SUBSTITUATION PRINCIBLE : Objects of a superclass shall be replacable with objects of its subclasses without breaking the application
		- That reqires the objects of your subclasses to behave in the same way as the objects of your superclass
		- child classes should never break the parent class type definition
		( SUBTYPES MUST BE SUBSTITUTABLE FOR THEIR BASE TYPES)
		- Devired types must be completely substituation for their base types
		- 2 Important design pattern that can guarantee that the liskov substituation principle is not violated : 
			* Strategy pattern
			* Template pattern
			
	+) INTERFACE SEGREGATION PRINCIBLE :states that no client should be forced to depend on methods it does not use.
		- It is not good if an interface has a large number of methods
		- We should separate the methods accordingly 
		- No client should be forced to depend on methods it does not use
		- When it is possible we should break our interfaces in many smaller ones so they better satisfy the exact needs of our clients
		
	+) DEPENDENCY INVERSION PRINCIBLE : high-level modules should not depend on low-level modules. Both should depend on abstractions
										Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions
			- We should avoid coupled code :
				-> Create an object of a class with new keyword results in a class being tightly coupled to another class
				-> Dependency inversion principle helps to create loosely coupled software modules
				-> modules should depend on abstractions 
			In object oriented programming we can implement inversion of control several ways:
				-> Using design patterns : factory, emplate or strategy patterns
				-> using service locator pattern
				-> using dependency injection
