import java.util.Scanner;

public class Main1064 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String b = in.next("[^\\d]");
        System.out.print(a+","+b);
    }
}
