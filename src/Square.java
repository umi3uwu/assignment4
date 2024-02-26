public class Square implements FigureInterface{
    private double side;
    Square(double side){
        this.side=side;
    }
    @Override
    public void show() {
        System.out.println("Side of square: "+side);
    }

    @Override
    public double area() {
        return side*side;
    }
}
