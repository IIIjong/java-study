### ✅ **1주차: 자바 문법 & 객체지향 설계**

**주제**

* 클래스, 상속, 인터페이스
* 추상 클래스 vs 인터페이스 실전 비교
* 접근 제어자, static / final
* enum, record 실습
* equals(), hashCode() 재정의
* 예외 처리 (Checked vs Unchecked, 커스텀 예외)

**실습**

* 동물/도형 설계 및 다형성 적용
* record vs 일반 DTO 비교
* 커스텀 예외 시나리오 작성

---

### ✅ **2주차: 자료구조 & 컬렉션 + 제네릭**

**주제**

* ArrayList vs LinkedList
* HashMap vs TreeMap
* HashSet, LinkedHashSet, TreeSet 비교
* Stack, Queue, Deque
* 제네릭 기본 개념과 실습

**실습**

* 삽입/삭제/탐색 성능 측정
* Set으로 중복 제거 실험
* “왜 이 자료구조를 선택했는가” 발표

---

### ✅ **3주차: 람다 & 메서드 참조 + Comparator/Comparable + 함수형 인터페이스**

**주제**

* 람다 표현식 문법
* 메서드 참조 (`Class::method`)
* Comparator vs Comparable 차이
* Comparator 커스터마이징
* 함수형 인터페이스 (Predicate, Function, Consumer 등)

**실습**

* 서비스 로직을 람다로 단순화
* 정렬 기준 구현 실습
* 기존 코드 람다/메서드 참조로 리팩토링

---

### ✅ **4주차: Optional + Stream 기초**

**주제**

* Optional 기본/고급 사용법 (map, flatMap, orElse, ifPresent)
* Stream 기초: map, filter, reduce
* sorted, distinct, collect
* Stream에서 람다 활용

**실습**

* NullPointerException 방지를 위한 Optional 설계
* 기존 for문 → Stream 리팩토링
* 주문/고객/상품 리스트 가공 문제

---

### ✅ **5주차: Stream 심화 & 병렬 스트림**

**주제**

* flatMap 개념 및 활용
* Stream + Optional 혼용
* 병렬 스트림 개념과 유의점
* 성능 측정과 최적화

**실습**

* 데이터 그룹화/집계 (Collectors.groupingBy 등)
* flatMap 활용 예제
* 병렬 스트림과 순차 스트림 성능 비교

---

### ✅ **6주차: JVM & 메모리 구조**

**주제**

* JVM 구조 (Heap, Stack, Metaspace)
* GC(Garbage Collection) 종류와 동작
* JVM 옵션 (`-Xms`, `-Xmx`, `-XX:+PrintGCDetails`)
* 리플렉션 기본 개념
* 직렬화와 transient 키워드

**실습**

* GC 로그 출력 실습
* 리플렉션으로 필드 값 접근/수정
* Serializable과 transient 차이 실험

---

### ✅ **7주차: 실무 설계 패턴 + Java 17\~21 신문법**

**주제**

* Lombok (@Getter, @Builder, @Slf4j 등)
* Builder 패턴 vs Telescoping Constructor
* 전략 패턴과 enum 조합
* 인터페이스 중심 설계
* 전역 예외 처리 (@ControllerAdvice)
* record 심화, sealed class, switch 표현식 개선
* Text block, pattern matching, virtual thread

**실습**

* 상품 주문 시나리오에 전략 패턴 적용
* 커스텀 예외 + 핸들러 구현
* 기존 코드 → 신문법으로 리팩토링
* sealed class로 도메인 계층 설계


---

## ✏️ **8주 요약**

| 주차  | 주제                      |
| --- | ----------------------- |
| 1주차 | 문법 & 객체지향 설계            |
| 2주차 | 자료구조 & 컬렉션 + 제네릭        |
| 3주차 | 람다 & 메서드 참조, Comparator |
| 4주차 | Optional + Stream 기초    |
| 5주차 | Stream 심화 & 병렬          |
| 6주차 | JVM & 메모리 구조            |
| 7주차 | 설계 패턴 + Java 17\~21     |

