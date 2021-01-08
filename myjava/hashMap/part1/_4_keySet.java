import java.util.*;
import java.util.Map.Entry;
//import java.util.HashMap;
//import java.util.Map;

class _4_keySet{

	public static void main(String[] args) {
		
		Map<String,Integer> mymap=new HashMap<>();

		mymap.put("one",1);
		mymap.put("two",2);
		mymap.put("five",5);

		//System.out.println(mymap.keySet());
		//System.out.println(mymap.values());

		//System.out.println( mymap.entrySet() );j//ab map banatey ha to us ma entry hoti ha jo ke data type ko show karta ha

		/*
		class Entry<k,v>{
	
				 k<string> key:
				v<Integer>  value:

			}

		*/

		Set< Entry<String,Integer> > entries=mymap.entrySet();
		for(Entry<String,Integer> entry: entries){

			entry.setValue( entry.getValue() * 100 );

		}
		System.out.println(mymap);
	}

}