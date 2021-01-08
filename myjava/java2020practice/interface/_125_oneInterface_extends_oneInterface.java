
class _46_do_while{

	public static void main(String args[]){

		Fatehr obj=new Fatehr();
		
}

interface Fatehr {

	public static final int mark=101;
	public static final int roll=102;
	public static final void disp();
	
	int add(int x,int y);
}

interface Mother {

	int a=103;
	void ab();

}

interface Son extends Fatehr,Mother{

	int attendance=75;
	int putData();

}