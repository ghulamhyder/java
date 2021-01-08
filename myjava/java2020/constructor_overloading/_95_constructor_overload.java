class _95_constructor_overload{

	public static void main(String args[]){

		Test obj=new Test(11);
		Test obj1=new Test(22,"hyder",34.55);
		Test obj2=new Test(44,55);

	}
}

class Test {

	public int x,y,z;
	public Double p;
	public String str;

	Test(int a){

		this.x=a;
		System.out.println("Test(int a) "+this.x);
	}

	Test(int b,int c){

		this.y=b;
		this.z=c;
		System.out.println("Test (a,b) "+this.y+","+this.z);
	}
	Test(int a,String st,Double p1){

		this.x=a;
		this.str=st;
		this.p=p1;
		System.out.println("Test(int a,string st,double p1) "+this.x+","+this.str+","+this.p);
		//System.out.println("Test(int a) "+this.x);
		//System.out.println("Test(int a) "+this.x);
	}


}