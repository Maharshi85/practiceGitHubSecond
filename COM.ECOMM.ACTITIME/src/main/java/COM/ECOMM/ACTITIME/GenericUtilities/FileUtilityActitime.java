package COM.ECOMM.ACTITIME.GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtilityActitime {
	public String dataFrompropertyFile(String key) throws Throwable
	{
		FileInputStream f=new FileInputStream(Ipathconstantactitime.propertypath);
		Properties p=new Properties();
		p.load(f);
		String value=p.getProperty(key);
		return value;
	}
}
