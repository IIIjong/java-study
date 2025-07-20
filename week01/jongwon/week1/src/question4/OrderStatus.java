package question4;

public enum OrderStatus {
    NEW("신규"),
    PROCESSING("진행중"),
    COMPLETED("완료"),
    CANCELLED("취소");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + "description= " + description ;
    }
}
