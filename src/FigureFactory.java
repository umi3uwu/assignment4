import java.util.Scanner;

public class FigureFactory {

    public FigureInterface createShape(String type) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);

        switch (type.toLowerCase()) {
            case "circle":
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                return new Circle(radius);
            case "square":
                System.out.print("Enter side length: ");
                double side = scanner.nextDouble();
                return new Square(side);
            case "triangle":
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                return new Triangle(base, height);
            default:
                throw new IllegalArgumentException("Unsupported shape type: " + type);
        }
    }
}
