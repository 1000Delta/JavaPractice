import javax.script.SimpleBindings;
import java.util.Scanner;
import java.util.jar.Attributes;

public class Main1041 {

    private static final char firstIndex = 'A';

    private static final char edgeIndex = 'F';

    public static void main(String[] args) {

        // 初始化加密映射
        Scanner in = new Scanner(System.in);
        SimpleBindings polybiusMap = new SimpleBindings();
        StringBuilder keyConstructor = new StringBuilder();
        char initIndex = 0;
        String cipherRule = "QWERTYUIOPASDFGHJKLZXCBNM";
        for (char i = firstIndex; i < edgeIndex; i++) {

            for (char j = firstIndex; j < edgeIndex; j++) {

                keyConstructor.append(i)
                        .append(j);
                polybiusMap.put(keyConstructor.toString(), cipherRule.charAt(initIndex));
                keyConstructor.delete(0, keyConstructor.length());
                initIndex++;
            }
        }
        polybiusMap.put("FF", 'V');

        int k = in.nextInt();
        in.nextLine();
        while (k-- > 0) {

            String line = in.nextLine();
            int lineLength = line.length();
            for (int i = 0; i < lineLength; i++) {

                if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {

                    keyConstructor.append(polybiusMap.get(line.substring(i, i+2)));
                    i++;
                } else {

                    keyConstructor.append(line.charAt(i));
                }
            }
            System.out.println(keyConstructor.toString());
            keyConstructor.delete(0, keyConstructor.length());
        }
    }
}
