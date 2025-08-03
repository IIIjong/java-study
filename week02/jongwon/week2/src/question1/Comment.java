package question1;

public class Comment {
    String writer;
    String content;

    public Comment(String writer, String content) {
        this.writer = writer;
        this.content = content;
    }

    @Override
    public String toString() {
        return "작성자: " + writer + " " + "내용: " + content;
    }
}
