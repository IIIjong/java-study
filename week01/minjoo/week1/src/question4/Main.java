package question4;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("1", "노트북", OrderStatus.NEW);
        printOrder(order);

        order= order.withStatus(OrderStatus.PROCESSING);
//        order.status = OrderStatus.PROCESSING;

        printOrder(order);

        order = order.withStatus(OrderStatus.COMPLETED);
        printOrder(order);

        System.out.println(" order 상태 설명 목록 ");
        for(OrderStatus status : OrderStatus.values()) {
            System.out.println(status.name() + "-" + status.getDescription());
        }
    }
    private static void printOrder(Order order) {
        System.out.println("🧾 주문 번호: " + order.orderId());
        System.out.println("📦 상품: " + order.product());
        System.out.println("📌 상태: " + order.status());
        System.out.println("ℹ️ 설명: " + order.status().getDescription());
        System.out.println();
    }
}
