package question5;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    T item;

    public Box(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
