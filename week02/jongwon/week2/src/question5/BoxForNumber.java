package question5;

import java.util.ArrayList;
import java.util.List;

public class BoxForNumber <T extends Number> {
    private final T number;

    public BoxForNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

}
