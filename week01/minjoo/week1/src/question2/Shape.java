package question2;

public abstract class Shape implements Resizable {
    public abstract void draw();
    String color;
    public Shape(String color) {
        this.color = color;
    }

}
