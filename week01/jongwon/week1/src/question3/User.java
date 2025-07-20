package question3;

import java.util.UUID;

public class User {
    private String name;
    private int age;
    final UUID id;
    public static int userCount=0;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = UUID.randomUUID();
        printUserCount();
    }

    public static void printUserCount() {
        userCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
