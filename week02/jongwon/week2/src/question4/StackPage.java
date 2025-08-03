package question4;

import java.util.Scanner;
import java.util.Stack;

public class StackPage {
    public void stackPage() {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String frontPage = "";
        while (true) {
            String str = sc.nextLine();
            if (str.equals("back")) {
                frontPage = stack.pop();
            } else if (str.equals("front")) {
                stack.push(frontPage);
            } else if (str.equals("exit")) {
                break;
            } else {
                stack.push(str);
            }
            System.out.println(stack);
        }
    }
}
