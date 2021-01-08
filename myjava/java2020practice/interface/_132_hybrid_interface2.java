
class _132_hybrid_interface2{

	public static void main(String args[]){

		Result obj=new Result();
		obj.disp();
		
	}
}

class Student {

	public int roll=132;
	public int practical=50;

}
class Exam extends Student {

		public int theory=100;

		public int totalMarks=this.theory + this.practical;

}
interface Project {

	public static final int pm=200;
	public abstract void disp();
}
class Result extends Exam implements Project{

	public int sum=this.totalMarks + Project.pm;

	public void disp(){

			System.out.println("Roll = " + this.roll);
			System.out.println("practical = " + this.practical);
			System.out.println("totalMarks = " + this.totalMarks);
			System.out.println("pojectmarks = " + Project.pm);
			System.out.println("SumAll= " + this.sum);
	}

}

