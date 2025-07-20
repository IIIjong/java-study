package question3;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("박종원", 26);
        User user2 = new User("백민주",26);
        User admin = new User("관리자",999);

        System.out.println(admin.id);
        //System.out.println(admin.name);
        System.out.println(User.userCount);

    }
}
