class QuickSort{

	void display(int[] arr){
		for(int num : arr)
			System.out.print(num + " ");
		System.out.println();	
	}

	int partition(int[] arr, int lo, int hi){
		int i, j;

		for(i = lo-1, j = hi - 1; i < j; j--)
			if(  arr[j] < arr[hi] ){
				i++;
				arr[j] = ( arr[i] + arr[j] ) - ( arr[i] = arr[j] );
 			} 

 		i++;
 		arr[i] = ( arr[hi] + arr[i] ) - ( arr[hi] = arr[i] );
 		return i; 
	}

	void sort(int[] arr, int lo, int hi){
		if( lo < hi ){
			display(arr);
			int piv = partition(arr , lo , hi);

			sort(arr, lo, piv-1);
			sort(arr, piv+1, hi);
		}
	}
}

class QSDemo{
	 public static void main(String[] args) {
	 	int[] arr = {10, 7, 8, 9, 1, 5};
	 	QuickSort obj = new QuickSort();
	 	obj.display(arr);
	 	obj.sort(arr, 0, arr.length-1);
	 	obj.display(arr);
	 }
}