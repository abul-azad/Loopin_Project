package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

    public class My_Set 
    {
	
	public static void main(String[] args) 
	{
	//HashSet does not allow any duplicate  but its allow one Null.
	Set<String> My_Set = new HashSet<String>();	
	
	My_Set.add("Null");
	My_Set.add("Null");
	My_Set.add("Jon");
	My_Set.add("Rock");
	My_Set.add("Loppez");
	My_Set.add("Loppez");
	My_Set.add("jony");
	My_Set.add("Justin");
	My_Set.add("Star");
	My_Set.add("Null");
	
	
	System.out.println(My_Set);
	System.out.println( My_Set.size());
	//-----------------------------------------------------------------------
	
	//LinkHashSet allow one null no duplicate and follow inserting order
	
	Set<Integer> My_Account = new LinkedHashSet<Integer>();
	 
	My_Account.add(null);
	My_Account.add(null);
	My_Account.add(30);
	My_Account.add(30);
	My_Account.add(200);
	My_Account.add(100);
	My_Account.add(500);
	My_Account.add(400);
	My_Account.add(150);
	
	System.out.println(My_Account);
	System.out.println(My_Account.size());
	
	//---------------------------------------------------------------------------
	
	Set<Integer> NewSet = new TreeSet<Integer>();
	//TreeSet does not allow any null,and does not allow any duplicate value and follow ascending order 
	
	//NewSet.add(null)
	NewSet.add(500);
	NewSet.add(500);
	NewSet.add(200);
	NewSet.add(1500);
	NewSet.add(1100);
	NewSet.add(800);
	NewSet.add(1000);
	
	System.out.println(NewSet);
	System.out.println(NewSet.size());
	
	

	
	}
	
}

