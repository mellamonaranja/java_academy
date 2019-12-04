import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormatter;


public class JodaTimeEx {

	public static void main(String[] args) {
		String today=new DateTime().toString(DateTimeFormat.forPattern("yyyy-MM-dd"));
		
		LocalDateTime date=LocalDateTime.now();
		DateTimeFormatter fmt=DateTimeFormatter.forPattern(("yyyy-MM-dd"));
		String dateString=date.toString(fmt);
		System.out.println(dateString);
		

	}

}
