package question2;

public class Rectangle extends Shape implements Resizable {
    public Rectangle(String color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Rectangle draw");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Rectangle 변경값 "+factor);
    }
}
