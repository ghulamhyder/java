class _02_ascendingOrder{


	public static void main(String[] args) {
		int arr[]={1,12,4,3,2};


		for(int i=0; i<arr.length; i++){

			for(int j=i+1; j<arr.length; j++){

				if(arr[i] > arr[j]){

					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
		}

		for(int elem:arr){

			System.out.println(elem);
		}

	}
}