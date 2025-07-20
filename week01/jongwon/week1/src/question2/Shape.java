package question2;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
    abstract void draw();
}
