package ImplementDataStructure;



public class BinarySearch {
	// 1 2 5 8 11 15 20 25
	
	public static void main(String[] args){
		
		int[] arr = {1 ,2, 5, 8, 11, 15, 20, 25};
		
		System.out.println(search(arr, 20));
		System.out.println(search(arr, 1));
		System.out.println(search(arr, 999));
	}

	public static int search(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;
		
		int indexTarget = -1;

		while (low <= high) {
			int mid = low +((high - low) / 2); // or int mid = (low + high) / 2;

			if (arr[mid] == target) {

				indexTarget= mid;
				break;

			} else if (arr[mid] > target) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}

		}
		return indexTarget;
	}

}
