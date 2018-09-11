import java.util.Scanner;

public class Main1036 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        in.nextLine();
        while (k-- > 0) {

            int[] list = new int[200];
            int top = 0;
            int num;
            char opt;
            int sum;
            String val = in.nextLine();
            String[] valList = val.split(" ");
            for (String i : valList) {

                try {

                    num = Integer.parseInt(i);
                    list[top++] = num;
                } catch (Exception e) {

                    opt = i.charAt(0);
                    switch (opt) {

                        case '+':
                            list[top-2] = list[top-2] + list[top-1];
                            break;
                        case '-':
                            list[top-2] = list[top-2] - list[top-1];
                            break;
                        case '*':
                            list[top-2] = list[top-2] * list[top-1];
                            break;
                        case '/':
                            list[top-2] = list[top-2] / list[top-1];
                            break;
                        case '%':
                            list[top-2] = list[top-2] % list[top-1];
                            break;
                        default:
                    }
                    top--;
                }
            }
            sum = list[top-1];
            System.out.println(sum);
        }
    }
}
