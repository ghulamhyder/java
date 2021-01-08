
class _46_do_while{

	public static void main(String args[]){

		Result obj=new Result();
		obj.disp();
		
	}

}

interface Project {

	public static final int pmark=200;
	
	 public abstract void disp();
	
}

class Student {

		public int roll=101;
		public int practical=50;
}

class Exam extends Student {

	public int theory=100;
	public int pm=this.theory + this.practical;

}

class Result extends Exam implements Project{

		int sum=this.pm + Project.pmark;

		public void disp(){

			System.out.println("Roll = "+this.roll);
			System.out.println("theory = "+this.theory);
			System.out.println("practical = "+this.practical);
			System.out.println("projectMarks = "+Project.pmark);
			System.out.println("Sum = "+this.sum);

		}
}













/*class Student{


}

interface Project{

}

class Exam extends Student{

}

class Result extends Exam implements Project {



}*/