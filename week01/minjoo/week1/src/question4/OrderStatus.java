package question4;

public enum OrderStatus {
    NEW("주문이 생성되었습니다."),
    PROCESSING("주문이 처리 중입니다."),
    COMPLETED("주문이 완료되었습니다."),
    CANCELLED("주문이 취소되었습니다.");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
