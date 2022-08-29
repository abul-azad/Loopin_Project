package List;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test_Array 
{
    int[] X = new int[6];
	
	public void Get_Array()
	{
	
	X[0]=50;
	X[1]=100;
	X[2]=200;
	X[3]=300;
	X[4]=300;
	X[5]=300;
	
	System.out.println(Arrays.toString(X));
	
	}
	public static void main(String[] args) 
	{
	Test_Array obj= new Test_Array();
	obj.Get_Array();
	}
	
}
