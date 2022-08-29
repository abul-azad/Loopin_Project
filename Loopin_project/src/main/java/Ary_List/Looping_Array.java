package Ary_List;

import java.util.Arrays;

public class Looping_Array 
{
	int[] a= {20,30,40,50};
	
	public void LoopArray_Test() 
	{
		
	for(int i=0; i<a.length; i++)	
	{
	System.out.println(Arrays.toString(a));	
	}
	
	}
	
	public static void main(String[] args) 
	{
	Looping_Array obj=new Looping_Array();
	obj.LoopArray_Test();
	}
	
}
