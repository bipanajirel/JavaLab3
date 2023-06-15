import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (MM/dd/yyyy): ");
        String inputDate = scanner.nextLine();
        scanner.close();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date givenDate = null;
        try {
            givenDate = dateFormat.parse(inputDate);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        Date currentDate = new Date();

        long daysSinceDate = TimeUnit.DAYS.convert(currentDate.getTime() - givenDate.getTime(), TimeUnit.MILLISECONDS);

        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM d, yyyy");
        System.out.println("It has been " + daysSinceDate + " days since " + outputFormat.format(givenDate));
    }
}
