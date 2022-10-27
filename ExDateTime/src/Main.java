import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //현재 시간
        LocalTime myobj = LocalTime.now();
        System.out.println(myobj);

        //현재 날짜 시간
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println(myDateObj);

        System.out.println("Before formatting: " + myDateObj);
        System.out.println(myDateObj.getClass().getName());
        //형변환
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(myFormatObj);

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        System.out.println(formattedDate.getClass().getName());
        System.out.println(formattedDate.getClass());
    }
}