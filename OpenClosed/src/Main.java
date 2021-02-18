public class Main {
    // Open for Extension - By implementing the IShape interface (any number of concrete
    // classes can be implemented to extend the system)
    // Closed for Modification - AreaCalculator will not need any modifications as its
    // functionality has already reached limits. More classes can be added like VolumeCalculator
    // but that will be extension, not modification.

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        AreaCalculator ac = new AreaCalculator();

        ac.calculateArea(rectangle);
        ac.calculateArea(circle);
    }
}
