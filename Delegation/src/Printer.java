public class Printer {
    // Delegator
    RealPrinter rp = new RealPrinter();

    void print() {
        System.out.println("The Delegator");
        rp.print(); // Delegation
    }

}
