package question2;

public class Main{
    public static void main(String[] args) {
        Shape circle = new Circle("blue");
        Shape rectangle = new Rectangle("yellow");

        circle.draw();
        rectangle.draw();
        circle.resize(30);
        rectangle.resize(100);

    }
}
