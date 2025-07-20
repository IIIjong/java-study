package question3;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("민주", 20);
        User u2 = new User("밥아저씨", 30);

        System.out.println(u1.age);
        System.out.println(u1.getName());

        System.out.println("총 사용자 수 : " +  User.getUserCount());
        System.out.println("총 사용자 수 : " +  u1.getId());


    }
}
