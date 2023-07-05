import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> studentMaps = new HashMap<>();
        studentMaps.put("yamada", "英語: 90, 数学: 60");
        studentMaps.put("sato", "英語: 70, 数学: 100");
        studentMaps.put("tanaka", "英語: 70, 数学: 100");

        studentMaps.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);


        System.out.println("名前検索");
        String name = new java.util.Scanner(System.in).nextLine();

        String result;
        result = studentMaps.get(name);

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
