package question2;

public class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    public Rectangle(String color) {
        super(color);
    }

    public void resize(double factor) {
        System.out.println("Resizing a Rectangle"+ factor);
    }
}
