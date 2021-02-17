// Example of Programming to an Implementation:
// Dog d = new Dog();
// d.bark();

//Example of Programming to an Interface:
// Animal a = new Dog();
// a.makeSound();

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.setDisplayModule(new Monitor());
        computer.display();

        computer.setDisplayModule(new Projector());
        computer.display();
    }
}
