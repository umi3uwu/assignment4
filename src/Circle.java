public class Circle implements FigureInterface{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void show() {
        System.out.println("Radius of circle: "+ radius);
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
