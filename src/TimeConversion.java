import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        //input "10:22:35AM", "10:22:35PM" -> 10:22:35, 22:22:35

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdu ora in format de 12 ore (AM/PM): ");
        String ora = sc.next();

        if (ora.contains("AM")){
            // stergem stringul AM din ora
            System.out.println(ora.substring(0,ora.indexOf("A")));
        }else {
            // stergem stringul PM din ora
            ora = ora.replace("PM", "");
            String oraText = ora.substring(0,2);
            int oraNumar = Integer.parseInt(oraText);
            oraNumar += 12;
            StringBuilder sb = new StringBuilder();
            sb.append(oraNumar).append(ora.substring(2));
            System.out.println(sb);
        }
    }
}
