import java.util.Scanner;

/**
 * XTUoj - 1035
 *
 * @author DX
 * @date 2018/08/06
 */
public class Main1035 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- > 0) {

            int n = in.nextInt();
            int[] before = new int[n];
            int[] after = new int[n];
            for (int i = 0; i < n; i++) {

                before[i] = i+1;
                after[i] = in.nextInt();
            }
            int[] mid = new int[n];
            int p0 = 0;
            int p1 = 0;
            int pm = 0;
            while (true) {

                // 当前栈为空时，若中栈为空
                if (p0 > n-1 && (pm == 0 || mid[pm-1] != after[p1])) {

                    break;
                    // 对比前后栈顶
                } else if (p0 < n && before[p0] == after[p1]) {

                    p0++;
                    p1++;
                    // 对比中后栈顶
                } else if (pm > 0 && mid[pm - 1] == after[p1]) {

                    pm--;
                    p1++;
                    // 均失败则入中栈
                } else if (p0 < n) {

                    mid[pm] = before[p0];
                    pm++;
                    p0++;
                }
            }
            if (p0 == p1) {

                System.out.println("Yes");
            } else {

                System.out.println("No");
            }
        }
    }
}
