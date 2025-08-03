package question2;

public class Member {
    String id;
    int point;

    public Member(String id, int point) {
        this.id = id;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", point=" + point +
                '}';
    }
}
