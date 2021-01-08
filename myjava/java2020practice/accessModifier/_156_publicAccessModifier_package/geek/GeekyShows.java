package geek;
import package1.*;
import package2.*;
class GeekyShows {


	public static void main(String args[]){

		System.out.println("Dell class:");
		Dell obj1=new Dell();
		obj1.dispd();

		System.out.println("Hp class:");
		Hp obj2=new Hp();
		obj2.disph();


		System.out.println("Computer class:");
		Computer obj3=new Computer();
		obj3.dispc();



	}
}