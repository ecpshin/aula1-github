package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Nivelamento {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2019-12-23T10:42:00Z"));
		
		System.out.println(sdf.format(d));
	}
}
