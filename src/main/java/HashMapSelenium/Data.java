package HashMapSelenium;

import java.util.HashMap;

public class Data {
	public HashMap<String, String> getUsrLoginInfo()
	{
		HashMap<String, String>userMap=new HashMap<String, String>();
		userMap.put("eclipse","eclipse");
		userMap.put("tom","hook");
		
		return userMap;
	}

	
	public HashMap<Integer, String> monthMap()
	{
		HashMap<Integer, String>MonthMap=new HashMap<Integer, String>();
		MonthMap.put(1,"Janauary");
		MonthMap.put(1,"February");
		
		return MonthMap;
	}
}
