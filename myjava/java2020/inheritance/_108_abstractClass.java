class _108_abstractClass{
	public static void main(String args[]){

		Son objS=new Son();

		Daughter objD=new Daughter();

		objS.func();
		objD.func();

	}

}

abstract class Father {

	abstract public void func();
}

class Son extends Father{


	public void func(){

		System.out.println("Abstract class method defined in subclass \"son\"");
	}
}
class Daughter extends Father{


	public void func(){

		System.out.println("Abstract class method defined in subclass \"Daughter\"");
	}
}

