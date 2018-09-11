import java.util.ArrayDeque;
import java.util.Scanner;

public class Main1037 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        in.nextLine();
        while (k-- > 0) {

            ArrayDeque<Character> stack = new ArrayDeque<>(1000);
            String list = in.nextLine();
            for (char i : list.toCharArray()) {

                if (stack.peek() != null && stack.peek() == i) {

                    stack.pop();
                } else {

                    stack.push(i);
                }
            }
            if (stack.peek() != null) {

                System.out.println("No");
            } else {

                System.out.println("Yes");
            }
        }
    }
}
