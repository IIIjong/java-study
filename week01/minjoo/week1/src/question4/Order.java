package question4;

public record Order(String orderId, String product, OrderStatus status) {
    // 상태만 바꾼 새 order 객체를 반환하는 메서드
    public Order withStatus(OrderStatus newStatus) {
        return new Order(this.orderId, this.product, newStatus);
    }
}