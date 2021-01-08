import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Set;
import java.util.Iterator;
//import java.util.Map.Entry;


class _02_hasmap{

	static HashMap<Integer,String> myarr=new HashMap<>();
	public static void main(String[] args) {
		myarr.put(500,"Eidal");
		myarr.put(300,"rind");
		myarr.put(700,"baloch");

		Set mykeys=myarr.keySet();
		
		//Set myval=myarr.values();//but this can can't run
		//this run on this format
		//System.out.println(myarr.values());

		//Set entry=myarr.entrySet(); it gives the set entry

		/*for(Map.Entry<Integer,String> entry:myarr.entrySet()){

		
			System.out.println(entry);
	}*/

	Iterator<Integer> li=myarr.listIterator();
	while(li.hasNext()){

		System.out.println(li.next());
	}
		
		


		
		
		

	}
}






