package question6;

public class UserService {
    public static void registerUser(String name, int age){
        if(age <= 0 || age >= 120){
            throw new InvalidBookException("나이 입력이 잘못되었습니다." + age);
        }
        System.out.println("사용자 등록 완료 : " + name + " (" + age + ")");
    }
}
