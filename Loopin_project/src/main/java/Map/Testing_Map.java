package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Testing_Map 
{

    public static void main(String[] args) 
    {
		
    //HashMap allow only one null, Its not allow Duplicate Keys But it is Allow Duplicate values.
		
    Map<String, String> My_Map= new HashMap<>();
		
    My_Map.put(null, null);
	My_Map.put(null, null);
	My_Map.put("First_Name", "Abul");
	My_Map.put("First_Name", "Abul");
	My_Map.put("Middle_Name", "Kalam");
	My_Map.put("Last_Name", "Azad");
	My_Map.put("Nick_Name", "Ripon");
	My_Map.put("Country_Name", "United State");
	My_Map.put("Stae_Name", "New York");
	My_Map.put("City_Name", "Buffalo");
	My_Map.put("Position_Name", "Qa Engineer");
		
	System.out.println(My_Map);
	System.out.println(My_Map.size());
	
	//-----------------------------------------------------------------------
		
	Map<Integer, String> New_Map = new HashMap<>();
		
	New_Map.put(null, null);
	New_Map.put(null, null);
	New_Map.put(101, "Asus_Laptop");
	New_Map.put(101, "Asus_Laptop");
	New_Map.put(344, "Ram");
	New_Map.put(455, "Mouse");
	New_Map.put(586, "KeyBoard");
	New_Map.put(666, "Front Camera");
		
	System.out.println(New_Map);
	System.out.println(New_Map.size());
		
	String Key_serialNumber=New_Map.get(586);
	System.out.println(Key_serialNumber);
	//--------------------------------------------------------------------------
		
	//Hastable its not allow null, And its allow Duplicate Keys But now Allow any Duplicate values.
		
	Map<String, String> New_table = new Hashtable<>();
		
	//New_table.put(null, null);
	New_table.put("First Name", "jon");
	New_table.put("Last Name","Rahman");
	New_table.put("State", "New york");
	New_table.put("Country", "United State");
	New_table.put("Qa", "program");
	New_table.put("First Name", "jon");
		
	System.out.println(New_table);
		
	String keynum2 = New_table.get("State");
	System.out.println(keynum2);
		
		
	}
  
    	   
    	  
	
	
}
