package question2;

import java.util.Scanner;

public class Circle extends Shape implements Resizable {
    public Circle(String color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Circle 변경된 값 "+ factor);
    }
}
