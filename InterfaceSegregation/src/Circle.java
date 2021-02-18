public class Circle implements IShape, ICalculate{
    @Override
    public void area() {
        System.out.println("Area of Circle");
    }

    @Override
    public void calculate() {
        area();
    }
}
