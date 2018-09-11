package test;

import java.io.BufferedInputStream;
import java.util.*;

public class Main {

    public static void main (String[] args) {

        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int t, n, v;
        float all;
        int[] value = new int[1000];
        int[] volume = new int[1000];
        float[] valuev = new float[1000];
d
        t = in.nextInt();

        while (t-- > 0) {

            n = in.nextInt();
            v = in.nextInt();
            for (int i = 0; i < n; i++) {

                value[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {

                volume[i] = in.nextInt();
                valuev[i] = value[i] / (float) volume[i];
            }
            max = 0;
            while (max < v) {

                for (int i = 0; i < n; i++) {


                }
            }
        }



    }
}
