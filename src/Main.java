import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Scanner inter = new Scanner(System.in);
        System.out.print("Input Year-Month-Day : ");
        String shortDate = inter.nextLine();
        LocalDate date = LocalDate.parse(shortDate);
        String day = Integer.toString(date.getDayOfMonth());
        String month = date.getMonth().toString();
        String year = Integer.toString(date.getYear());
        System.out.println(month + " " + day + " " + year);
    }
}
