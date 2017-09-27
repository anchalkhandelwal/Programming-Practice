
public class RotateArrayBruteForce {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		int n = arr.length;
		rotate(arr, d, n);
	}

	//time complexity O(n)
	//Space O(d)
	private static void rotate(int[] arr, int d, int n) {
		int[] temp = new int[d];
		int i;
		//create temp array
		for (i = 0; i < d; i++) {
			temp[i] = arr[n - d + i];
		}

		//rotate the original array
		for(i=n-1; i>=d ;i--){
			arr[i] = arr[i-d];
		}
		
		//merge temp array with arr
		for(i=0;i<d;i++){
			arr[i] = temp[i];
			
		}
		for(i = 0; i<n;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
