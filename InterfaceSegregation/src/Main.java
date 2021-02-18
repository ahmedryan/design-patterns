// Functions of Interface:
// 1. Common Functionality to unrelated classes (Perhaps Multiple Inheritance)
// 2. Abstraction of Details to Client (Specify the behaviour of a particular data type but
// are not concerned about who implements its behaviour)
// 3. Produces flexible code which can work with any new implementation of the Interface. Any
// changes to the implementation will not affect the client. As long as the interface is not
// touched, the client needs no change

// Clients should not be forced to depend upon interfaces that they do not use.

// A client should not implement an interface if it does not use a method in that interface.

// Happens mostly when one interface contains more than one functionality and
// the client only needs one functionality and not the other.

// Suppose, Interface I contains methods A and B. Class C needs method A. But when Class C
// implements Interface I, method B also gets implemented as a by-product

// Interface Segregation Principle: Split the software into multiple independent parts.
// Solution to the above problem, make 2 interfaces namely InterfaceA (contains method A)
// and InterfaceB (contains method B).
// Then, Class C have the opportunity to implement only InterfaceA. That way, Class C will not
// have method B as a by-product.

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Sphere s = new Sphere();

        c.calculate();
        s.calculate();
    }
}
