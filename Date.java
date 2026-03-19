import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {

        // Create Date object (current date and time)
        Date currentDate = new Date();

        // Display current date and time
        System.out.println("Current Date and Time: " + currentDate);

        // Format the date
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted Date and Time: " + formattedDate);

        // Use Calendar to extract day, month, year
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);

        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH) + 1; // Month starts from 0
        int year = cal.get(Calendar.YEAR);

        System.out.println("Day   : " + day);
        System.out.println("Month : " + month);
        System.out.println("Year  : " + year);
    }
}