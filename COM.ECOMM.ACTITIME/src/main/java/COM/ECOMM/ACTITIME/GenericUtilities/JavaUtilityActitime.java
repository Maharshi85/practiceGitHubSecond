package COM.ECOMM.ACTITIME.GenericUtilities;

import java.util.Date;
import java.util.Random;

public class JavaUtilityActitime {
	public int randomNumber()
	{
		Random r=new Random();
		return r.nextInt(1000);
		//int x=(int)Math.random()*1000;
		//return x;
	}
	public String defaultDate()
	{
		Date d=new Date();
		String date=d.toString();
		return date;
	}
	
	public String modifyDate()
	{
		Date d=new Date();
		String []s=d.toString().split(" ");
		String date=s[2];
		String month=s[1];
		String time=s[3].replace(":","_");
		String current=date+" "+month+" "+time;
		return current;
	}
}
