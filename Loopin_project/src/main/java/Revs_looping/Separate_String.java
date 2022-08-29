package Revs_looping;

public class Separate_String 
{
	String Name="Accounting2052";
			
	public static void main(String[] args) 
	{
		
	String Name="Accounting2052";
	String value=Name.replaceAll("[^A-Za-z]", "");
	System.out.println(value);
	String Number=Name.replaceAll("[^0-50]", "");
	System.out.println(Number);
		
		
	}
	
	
	
}
