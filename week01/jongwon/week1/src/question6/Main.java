package question6;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        //예외 발생사례
        try {
            new User().registerUser("박종원",130);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        //0~120 사이 범위 나이 정상 입력시
        try {
            new User().registerUser("백민주",26);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        try{
            user.exceptionTest("박종원.txt");
        }catch(FileReadException e){
            System.out.println(e.getMessage());
        }
    }
}
