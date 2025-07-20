package question3;

import java.util.UUID;

public class User {
    private final UUID id;
    private String name;
    public int age;
    private static int userCount;

    public User(String name, int age){
        this.id = UUID.randomUUID();
        this.age = age;
        this.name = name;
        userCount++;
    }

    public static int getUserCount() {
        return userCount;
    }

    public static void setUserCount(int userCount) {
        User.userCount = userCount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }
}
