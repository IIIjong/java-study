package question4;

public class Main {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.CANCELLED;
        Order order = new Order("1","키보드",OrderStatus.CANCELLED);
        //order.product = "마우스";
        //이런식 수정 불가능 불변객체이기 때문에 객체가 한번 할당되면 못바꿈
        //new 로 새로 만들어서 하는건 덮어 씌워서 재할당을 의미해서 가능한거임 헷갈리지말기
        System.out.println(order.toString());

        //상태 변경하려면
        order = new Order("1","키보드",OrderStatus.NEW);
        System.out.println(order.toString());
    }
}
