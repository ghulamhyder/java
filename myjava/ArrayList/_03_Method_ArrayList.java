import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

class _03_Method_ArrayList{


	public static void main(String[] args) {
		
	Myclass obj=new Myclass();
	
	obj.myfunc();
	
	//System.out.println(obj.myfunc());

}



}

class Myclass {


	LinkedList<String> fruits=new LinkedList<>();

	ArrayList<String> vegitables=new ArrayList<>();

	public void myfunc(){

		this.fruits.add("apple");
		this.fruits.add("orange");
		this.fruits.add("hi");

		///*add()* is belong from collection interface///
		
		this.vegitables.add("potato");
		this.vegitables.add("tomato");


		///*addAll()* collection 
		//fruits.addAll(this.vegitables);
		//System.out.println(fruits);

		//*get() it show value of given index
		//if you gives value out list then outofbound exception comes
		
		//System.out.println(fruits.get(12));

		//*set()* update the element on its index then we use set func
		//set(index,new value)
		//fruits.set(1,"banaba");

		//*remove()* remove element from arrlist

		//fruits.remove(1); //OR fruits.remove("apple");

		//*clear() this function clear all elements in list array
		//fruits.clear();



		//*removeAll()*

		/*ArrayList<String> toRemove=new ArrayList<>();
		toRemove.add("apple");
		toRemove.add("hi");
		fruits.removeAll(toRemove);*/

		//*size()* it show size of arraylist as like in array length
		//fruits.size()


		//*contains()* it value containe in arralist the return true or fasle
		//fruits.contains("apple")

		//*isEmpty()* it show the arraylist is empty or not
		//System.out.println(fruits.isEmpty());

		//*toArray()* it convert arrayList into array

			/*String temp[]=new String[fruits.size()];

			fruits.toArray(temp);

			for(String str:temp){ //foreach looop array list me bhi kam kersakta ha

				System.out.println(str);

			}*/
  
		
			for(String e:fruits){

				System.out.println(e);
			}

		

	}

	
	
	}