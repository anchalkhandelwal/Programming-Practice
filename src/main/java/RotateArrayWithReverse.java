
public class RotateArrayWithReverse {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8};
		int d = 4;
		int n = arr.length;
		rotateReverse(arr, d, n);
	}
//Time: O(n)
	//Space O(1)
	private static void rotateReverse(int[] arr, int d, int n) {
		int length1 = n;
		
		int i;
		for(i = n-d; i< n-1; i++){
			int temp = arr[i];
			arr[i] = arr[length1-1];
			arr[length1-1] = temp;
			length1--;		
		}
		
		int length2 = n-d;
		for(i =0; i<n-d-i && i < length2;i++){
			int temp = arr[i];
			arr[i] = arr[length2-1];
			arr[length2-1] = temp;
			length2--;
		}
		
		length1 = n;
		for(i =0; i< n && i<length1; i++){
			int temp = arr[i];
			arr[i] = arr[length1-1];
			arr[length1-1] = temp;
			length1--;
		}
		
		for(i = 0; i<n;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
