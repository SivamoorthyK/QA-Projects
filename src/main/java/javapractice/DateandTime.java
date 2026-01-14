package javapractice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.naming.ldap.InitialLdapContext;

public class DateandTime {

	public static void main(String[] args) {
		// OLD way before 8, mutable - not thread safe, less operations
		// toInstant() is to 
		
		// date class
		Date date= new Date();
		System.out.println(date.toString());
		
		//Calendar
		Calendar c= Calendar.getInstance();
		c.set(2025,c.JANUARY,1);
		System.out.println(c.getTime().toString());
		
		// formatting date
		SimpleDateFormat df= new SimpleDateFormat("DD/MM/YYYY");
		System.out.println(df.format(date));
		
		// find the time Zone
		TimeZone tm= TimeZone.getDefault();
		System.out.println(tm.getDisplayName());
		
		
	/** New approaches to see dates
	 * LocalDate
	 *  LocalTime
	 *  LocalDateTime
	 *  LocalDateFormatter
	 *  
	 *  
	 *  */
	LocalDate ld= LocalDate.of(2026, Month.JANUARY,15);	
	
	
	
	
		

		
		
		
		
	}

}
