class _89_enhanced_forloop{


	public static void main(String args[]){

		int num[][]={ {4,5,1,3},{13,27,18,26},{32,35,37,39},{1000,1001,857,1} };

		int newArr[]=new int[num.length];
		int x=0;
		for(int i[]:num){

			int largeNum=0;
			for (int val:i) {

				if(largeNum < val){

					largeNum=val;
				}
			}
			
			newArr[x]=largeNum;
			x++;
			
		}

		for(int k:newArr){
		System.out.println(k);
	}
	}
}