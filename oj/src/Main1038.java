import java.util.Scanner;

public class Main1038 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- > 0) {

            int n = in.nextInt();
            int[] encodeP = new int[n];
            int[] encodeW = new int[n];
            int[] insLeftParenthesis = new int[n];
            for (int i = 0; i < n; i++) {

                encodeP[i] = in.nextInt();
            }
            insLeftParenthesis[0] = encodeP[0];
            for (int i = 1; i < n; i++) {

                insLeftParenthesis[i] = encodeP[i] - encodeP[i - 1];
            }
            for (int i = 0; i < n; i++) {

                for (int j = i; j >= 0; j--) {

                    if (insLeftParenthesis[j] > 0) {

                        insLeftParenthesis[j]--;
                        encodeW[i]++;
                        break;
                    } else {

                        encodeW[i]++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {

                System.out.print(encodeW[i]);
                if (i < n - 1) {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
