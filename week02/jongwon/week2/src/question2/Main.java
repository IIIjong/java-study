package question2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Member> hashMap = new HashMap<>();
        Map<String, Member> treeMap = new TreeMap<>();
        for (int i = 1; i <= 1000; i++) {
            Member member = new Member(String.valueOf(i), i);
            hashMap.put(member.id, member);
            treeMap.put(member.id, member);
        }

        for (HashMap.Entry<String, Member> entry : hashMap.entrySet()) {
            Member member = entry.getValue();
            System.out.println(member);
        }

        for (Map.Entry<String, Member> entry : treeMap.entrySet()) {
            Member member = entry.getValue();
            System.out.println(member);
        }
    }
}
