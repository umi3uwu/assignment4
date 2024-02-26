public class Triangle implements FigureInterface{
    double height;
    double base;
    Triangle(double height, double base){
        this.base=base;
        this.height=height;
    }
    @Override
    public void show() {
        System.out.println("Base of triangle: "+base);
        System.out.println("Height of triangle: "+height);
    }

    @Override
    public double area() {
        return 0.5*base*height;
    }
}
