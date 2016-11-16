import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class main {
 
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2015);
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.DAY_OF_MONTH, 10);
		Date date = calendar.getTime();
		System.out.println(date);
		
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String dataFormatada = f.format(date);
		System.out.println(dataFormatada);
	}
}
