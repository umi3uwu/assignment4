import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FigureFactory factory = new FigureFactory();

        System.out.print("Enter the shape you want to create (circle, square, triangle): ");
        String shapeType = scanner.nextLine().toLowerCase();

        FigureInterface shape = factory.createShape(shapeType);

        shape.show();
        System.out.println("Area: " + shape.area());

        scanner.close();
    }
}
