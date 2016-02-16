package hiromitest.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BussinessCalendar {

	public static Date addMonth(String date , int addCount) {
	 if (date == null || date.equals("")) {
		 throw new RuntimeException("message-id0001");
	 }
	 SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	 Date targetDate = null;
	 try {
		targetDate = format.parse(date);
	 } catch (ParseException e) {
	 	 throw new RuntimeException("message-id0002");
	}
	 Calendar cal = Calendar.getInstance();
	 cal.setTime(targetDate);
	 int month = cal.get(Calendar.MONTH) + addCount;
	 cal.set(cal.get(Calendar.YEAR), month, cal.get(Calendar.DATE));
	 	return targetDate;

 }
}
