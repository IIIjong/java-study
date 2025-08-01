import java.util.Set;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(32);
        set.add(5);
        set.add(17);
        set.add(8);
        set.add(19);
        set.add(32);

        System.out.println(set.size()); //중복 저장이 안되기 때문에 6개를 저장해도 사이즈는 5
        System.out.println(set); //tree 구조를 이용해 정렬해서 출력 ex) [5, 8, 17, 19, 32]
    }
}
