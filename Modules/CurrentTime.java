import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    //Java DateTime API
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);
        //Output: Sun Apr 09 14:07:09 IST 2023

        //Format Date
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));
        //Output: 02:07:09

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate ));
        //Output: 04/09/2023

        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeekFormat.format(currentDate));
        //Output: Sunday

        SimpleDateFormat clockFormat = new SimpleDateFormat("H:mm a ");
        System.out.println(clockFormat.format(currentDate));
        //Output: 14:07 pm

        SimpleDateFormat dateAndTime = new SimpleDateFormat("EEEE,\nd , MMMM  yyyy \nHH : mm ");
        System.out.println(dateAndTime.format(currentDate));
        //Output:
        //Sunday,
        //9 , April  2023
        //14 : 07
    }
}
