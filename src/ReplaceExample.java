import javax.management.monitor.StringMonitor;

public class ReplaceExample {
    public static void main(String[] args) {

        String text = "Ana are mere";
        String result = text.replace("a","*");
        String text1 = text.replace("e","E");
        System.out.println(result);
        System.out.println(text1);

        String result2 = text.replace("Ana", "Alex");
        System.out.println(result2);

        String result3 = text.replace("pere", "struguri");
        System.out.println(result3);
    }
}
