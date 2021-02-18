public class Sphere implements IShape, ISolidShape, ICalculate{
    @Override
    public void area() {
        System.out.print("Surface Area of Sphere");
    }

    @Override
    public void volume() {
        System.out.println("Volume of Sphere");
    }

    @Override
    public void calculate() {
        area();
        System.out.print(" + ");
        volume();
    }
}
