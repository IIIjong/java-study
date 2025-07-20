package question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red");
        circle.draw();
        System.out.println(circle.color);
        Scanner scanner = new Scanner(System.in);
        System.out.println("변경 값을 적어주세요");
        double circleFactor = scanner.nextDouble();
        circle.resize(circleFactor);

        System.out.println();

        Rectangle rectangle = new Rectangle("blue");
        rectangle.draw();
        System.out.println(rectangle.color);
        System.out.println("변경 값을 적어주세요");
        double rectangleFactor = scanner.nextDouble();
        rectangle.resize(rectangleFactor);

    }
}
