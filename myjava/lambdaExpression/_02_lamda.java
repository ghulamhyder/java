
public class _02_lamda{


	public static void main(String[] args) {

		int a=10;
		
		Demo d=(String name)-> {

			//int b=20;

			System.out.println("hello world"+name+a);

		};
		


		d.show("hyder");
	}
}

interface Demo{

	abstract void show(String name);
}
