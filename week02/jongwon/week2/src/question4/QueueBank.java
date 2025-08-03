package question4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueBank {
    public void queueBank() {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<String>();
        while (true) {
            String name = sc.nextLine();

            if (name.equals("clear")) {
                System.out.println(((LinkedList<String>) queue).getFirst()+" 님 접수건 처리 완료입니다.");
                queue.poll();
                System.out.println("현재 대기자 명단 " + queue);
            } else if (name.equals("exit")) {
                break;
            } else {
                queue.add(name);

                System.out.println(((LinkedList<String>) queue).getLast() + "  님 " + queue.size() + " 번째 대기입니다");
                System.out.println("현재 대기자 명단 " + queue);
            }
        }
    }
}
