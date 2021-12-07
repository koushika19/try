package one;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat dt=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		String date1=dt.format(date);
		System.out.println("Old date: "+ date1);
		
		SimpleDateFormat dt1= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
		String date2=dt1.format(date);
		System.out.println("New date: "+ date2);
	}

}
