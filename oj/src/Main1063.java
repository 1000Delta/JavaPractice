import java.util.Scanner;

public class Main1063 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        StringBuffer hex = new StringBuffer();
        for (int tmp = num; tmp > 0;) {

            int digit;
            if (tmp > 15) {

                digit = tmp % 16;
                tmp /= 16;
                if (digit < 10) {

                    hex.insert(0, digit);
                } else {

                    hex.insert(0, (char)('A' + digit - 10));
                }
            } else {

                if (tmp < 10) {

                    hex.insert(0, tmp);
                } else {

                    hex.insert(0, (char)('A' + (tmp - 10)));
                }
                break;
            }
        }
        System.out.print(num+","+hex.toString());
    }
}
