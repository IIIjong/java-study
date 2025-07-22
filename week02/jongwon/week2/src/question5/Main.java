package question5;

import java.util.ArrayList;
import java.util.List;

//        📝 실습 문제: 선물 상자 시스템 만들기

//        제네릭 클래스 Box<T>를 만들어 T item 필드를 정의하세요. - 완료
//
//        Box<String>, Box<Integer>를 생성해 선물을 저장하고 꺼내보세요 - 완료

//        List<Box<?>>를 생성해 다양한 타입의 선물을 한꺼번에 출력해보세요 - 완료

//        ✏️ 추가 미션

//        Box<T extends Number>를 이용해 숫자 박스들의 합계를 구하는 메서드를 작성해보세요.
//          -> 더하기와 형변환을 어떻게 시키지?
//             get()으로 불러오고 doubleValue() 등과 같은 걸로 메서드체이닝으로 이어서 형변환 시켜서 한번에 썸에 더하는걸 새롭게 깨달았다

//        ? extends T, ? super T 와일드카드가 어떤 상황에서 유용한지도 실험해보세요.
//          -> 이건 아직 모르겠다 언제 유용한지 조금 더 찾아보자

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("박종원 박스");
        Box<Integer> integerBox = new Box<>(10);

//        System.out.println(stringBox.toString());
//        System.out.println(integerBox.toString());

        List<Box<?>> boxes = new ArrayList<Box<?>>();
        boxes.add(new Box<String>("백민주"));
        boxes.add(new Box<Integer>(25));
        boxes.add(new Box<Double>(3.1111));
        boxes.add(new Box<Float>(3.1f));
//        ? 와일드카드를 이용해서 모든 유형의 박스를 허용하고 그것을 List 컬렉션의 타입으로 채택한다.
//        이거 엄청 유연한듯? 레존드
        for (Box<?> box : boxes) {
            System.out.println(box.toString());
        }

        System.out.println();
//        깨달은 점 와일드카드여도 타입을 잘 적어두자
        List<BoxForNumber<?>> boxForNumbers = new ArrayList<>();
        boxForNumbers.add(new BoxForNumber<Integer>(10));
        boxForNumbers.add(new BoxForNumber<Double>(5.111));
        boxForNumbers.add(new BoxForNumber<Float>(5.1f));
        boxForNumbers.add(new BoxForNumber<Long>(20l));
        for (BoxForNumber<?> boxForNumber : boxForNumbers) {
            System.out.println(boxForNumber.getNumber());
        }
        double sum = 0;
        for (BoxForNumber<?> boxForNumber : boxForNumbers) {
            sum += boxForNumber.getNumber().doubleValue();
        }
        System.out.println(sum);
    }
}
