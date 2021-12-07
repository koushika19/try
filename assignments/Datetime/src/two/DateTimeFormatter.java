package two;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
 


public class DateTimeFormatter {
	public static void main(String[] args) {
	  
		    Date date = new Date();  
		    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");  
		    String strDate= formatter.format(date);  
		    System.out.println(strDate);  
		}  
		

}