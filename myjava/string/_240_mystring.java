class _240_mystring{

	public static void main(String args[]){

		//string object is not changble
		//bufferstring object is changeble
		/*String name=new String("geekyshows"); //this go in heap area and string constant protocl
		String name1="geekyshows"; //this go in scp area actully scp area not allowed grabage cllector 
		System.out.println("string with new"+name);
		System.out.println("string without new"+name1);*/

		//string object is not changble
		//see eample below///

		/*String st=new String("Geeky"); //is ko garbage aker lay jay ga ku ke ye heap area ma ha 
		st="shows"; ///is ko st point ker ra ha is liey pointer is per ajay ga
		System.out.println(st);*/


		//look example 2//
		//ku ke string not changebale
		/*String st2=new String("Geeky");
		st2.concat("shows");
		System.out.println(st2);*/

		//string buffer is changebel//
		StringBuffer stb=new StringBuffer("Geeky");
		stb.append("shows");
		System.out.println(stb);



	}
}