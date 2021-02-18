// Dependency Inversion: Entities must depend on abstractions and not on concretions
// High Level classes must not depend on low level classes
// Lower level class implementation is accessible to higher level class through an abstract
// interface. That way, actual implementation of lower level classes can vary.

// Top-to-Bottom dependency is the common idea. Here, inversion refers to the fact that classes do
// not have Top-to-Bottom dependency rather they have a dependency on abstraction.

// Pizza Store (Client/High-Level) -> Pizza (Interface) <- Different Pizzas (Concrete Classes/Lower-Level)

public class Main {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore(new FireballPizza());
    }
}
