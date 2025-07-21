package question6;

public class Main {
    public static void main(String[] args) {
        try{
            UserService.registerUser("민주", 120);
        } catch (InvalidBookException e) {
            System.out.println("예외 처리됨 : " + e.getMessage());
        }
        try {
            UserService.registerUser("홍길동" ,25);
        } catch (InvalidBookException e) {
            System.out.println("예외 처리됨 : " + e.getMessage());
        }
    }
}
