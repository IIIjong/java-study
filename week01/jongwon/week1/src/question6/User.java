package question6;

public class User {
    public void registerUser(String name, int age) throws InvalidAgeException {
        if(age<=0 || age>120){
          throw new InvalidAgeException("허용되지 않은 나이입니다 당신이 기입한 나이"+age);
        }else {
            System.out.println(name + "님 등록성공 입력하신 나이는 " + age);
        }
    }

    public void exceptionTest(String userFile) throws FileReadException {
        throw new FileReadException("등록하신 회원파일 " + userFile + " 잘못된 형식입니다");
    }
}
