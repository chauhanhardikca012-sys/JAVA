import java.util.Date;
import java.text.SimpleDateFormat;

public class DateMethod{
    public static void main(String[] args) {
        
        Date currentDate = new Date();
        
        System.out.println("Date and Time: " + currentDate);
        
   
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        
        System.out.println(" Formate Date and Time: " + formattedDate);
        
        
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        
        String day = dayFormat.format(currentDate);
        String month = monthFormat.format(currentDate);
        String year = yearFormat.format(currentDate);
        
        System.out.println("Day :" + day);
        System.out.println("Month :" + month);
        System.out.println("Year :" + year);
    }
}