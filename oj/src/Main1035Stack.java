import java.util.Scanner;

public class Main1035Stack {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        while (k-- > 0) {

            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] m = new int[n];
            for (int i = 0; i < n; i++) {

                a[i] = i + 1;
                b[i] = in.nextInt();
            }
            if (judge(a, m, b, 0, 0, 0, n)) {

                System.out.println("Yes");
            } else {

                System.out.println("No");
            }
        }
    }

    private static boolean judge (int[] a, int[] m, int[] b, int topA, int topMid, int topB, int maxTop) {

      if (topA == maxTop && (topMid == 0 || m[topMid - 1] != b[topB])) {

          return topA == topB;
      } else if (topA < maxTop && a[topA] == b[topB]) {

          return judge(a, m, b, topA + 1, topMid, topB + 1, maxTop);
      } else if (topMid > 0 && m[topMid - 1] == b[topB]) {

          return judge(a, m, b, topA, topMid - 1, topB + 1, maxTop);
      } else {

          m[topMid] = a[topA];
          return judge(a, m, b, topA + 1, topMid + 1, topB, maxTop);
      }
    }
}
