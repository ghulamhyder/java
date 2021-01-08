import java.util.*;


class _5_how_work_hash{

	public static void main(String[] args) {
		

		String x="hyd";

		char y=x.charAt(0);//ager ap char likho gay index ki psistion per value kon si dekhay ga
		
		int z=x.charAt(0);// ager ap int liko gay to value ki assci code batega;

		//System.out.println(z);
		System.out.println(getHash("GOD"));

	}

	public static int getHash(String str){

		int hash=0;

		for(int i=0 ; i<str.length(); i++){

			hash += str.charAt(i);

		}

		return hash;
	}


}