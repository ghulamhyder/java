import java.util.HashMap;


class _1_hashMap{


	static HashMap<String,Integer> contact=new HashMap<String,Integer>();
	static HashMap<String,Integer> mymap=new HashMap<String,Integer>();

	public static void main(String[] args) {

		contact.put("hyder",333); 
		contact.put("ali",334);
		contact.put("rind",336);

		mymap.putAll(contact);//put all insert all the entries into this map



		//contact.remove("ali");////remove key with value element
		//System.out.println(contact.get("hyder")); //for use specific key value find
		System.out.println(mymap);
	}

	
}