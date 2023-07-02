import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("山田", "英語: 90, 数学: 60");
        studentMap.put("佐藤", "英語: 70, 数学: 100");

        for (Map.Entry<String, String> studentEntry : studentMap.entrySet()) {
            System.out.println(studentEntry.getKey() + "さん　" + studentEntry.getValue());
        }

        System.out.println("名前検索");
        String name = new java.util.Scanner(System.in).nextLine();

        String result;
        result = studentMap.get(name);

        try {
            if (result != null) {
                System.out.println("名前: " + result);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(result + "は存在しません");
        } finally {
            System.out.println("検索終了");
        }
    }
}
