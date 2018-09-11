import java.util.Scanner;

public class Main1040 {

    public static void main (String[] args) {


        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- > 0) {

            int n = in.nextInt();
            int[] left = new int[n];
            int[] leftAll = new int[n];
            int[] right = new int[n];
            int max = 0;
            int holeNum = 0;
            in.nextLine();
            for (int i = 0; i < n; i++) {

                char[] allChar = in.nextLine().toCharArray();
                leftAll[i] = allChar.length;
                for (char ch : allChar) {

                    if (ch == 'X') {

                        left[i]++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {

                char[] allChar = in.nextLine().toCharArray();
                for (char ch : allChar) {

                    if (ch == 'X') {

                        right[i]++;
                    }
                }
                if (leftAll[i] + right[i] > max) {

                    max = leftAll[i] + right[i];
                }
            }
            for (int i = 0; i < n; i++) {

                holeNum += max - (left[i] + right[i]);
            }
            System.out.println(holeNum);
        }
    }
}
