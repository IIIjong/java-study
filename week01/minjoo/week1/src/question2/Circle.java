package question2;

public class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    public Circle(String color) {
        super(color);
    }
    public void resize(double factor) {
        System.out.println("Resizing a Circle"+ factor);
    }
}
