package question1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Comment> arrayComment = new ArrayList<>();
        List<Comment> linkedComment = new LinkedList<>();

        for (int i = 1; i <= 100; i++) {
            Comment comment = new Comment("작성자" + i, i + "번째 내용");
            arrayComment.add(comment);
            linkedComment.add(comment);
        }

        arrayComment.remove(arrayComment.size() - 1);
        linkedComment.remove(linkedComment.size() - 1);
        Comment recomment = new Comment("3번 글의 대댓글","대댓글입니다");

        arrayComment.add(3,recomment);
        linkedComment.add(3,recomment);

        for (Comment comment : arrayComment) {
            System.out.println(comment);
        }
        System.out.println();
        for (Comment comment : linkedComment) {
            System.out.println(comment);
        }
        System.out.println();

        System.out.println("삽입 테스트");
        long start = System.nanoTime();
        arrayComment.add(45,new Comment("테스트","테스트"));
        long end  = System.nanoTime();
        System.out.printf("arrayList %d\n", end-start);
        start = System.nanoTime();
        linkedComment.add(45,new Comment("<UNK>","<UNK>"));
        end  = System.nanoTime();
        System.out.printf("linkedList %d\n", end-start);
        System.out.println();

        System.out.println("조회 테스트");
        start = System.nanoTime();
        arrayComment.get(45);
        end  = System.nanoTime();
        System.out.printf("arrayList %d\n", end-start);
        start = System.nanoTime();
        linkedComment.get(45);
        end  = System.nanoTime();
        System.out.printf("linkedList %d\n", end-start);
        System.out.println();

        System.out.println("삭제 테스트");
        start = System.nanoTime();
        arrayComment.remove(45);
        end  = System.nanoTime();
        System.out.printf("arrayList %d\n", end-start);
        start = System.nanoTime();
        linkedComment.remove(45);
        end  = System.nanoTime();
        System.out.printf("linkedList %d\n", end-start);
    }
}
