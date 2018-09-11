import java.util.Scanner;

public class Main1039 {

    private static final int STEP = 21;

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        in.nextLine();
        while (k-- > 0) {

            String clearText = in.nextLine();
            char[] cipher = clearText.toCharArray();
            int textLength = cipher.length;
            for (int i = 0; i < textLength; i++) {

                for (int j = 0; j < STEP; j++) {

                    if (cipher[i] >= 'A' && cipher[i] < 'Z') {

                        cipher[i] += 1;
                    } else if (cipher[i] == 'Z') {

                        cipher[i] = 'A';
                    }
                }
            }
            for (char ch : cipher) {

                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
