public class PascalsTriangle {
	public final int PAS_ROWS = 6;

	//Get array using recursive method
	public int[] getArr(int n) {
		int[] arr = new int[n];
		for (int x = 0; x < n; x++) {
			arr[x] = getSum(n, x);
		}

		return arr;
	}

	//recursive method
	//computes 
	public int getSum(int n, int x ) {
		if (x == n - 1 || x == 0) {
			return 1;
		} else {
			return getSum(n - 1, x) + getSum(n - 1, x - 1);
		}
	}

	//displays array
	public void showArray(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + " ");
		}
	}

	public void showLine(int n) {
		showArray(getArr(n));
	}

	
	//displays entire Triangle
	public void showEntireTriangle() {
		for (int x = 1; x <= PAS_ROWS; x++) {
			showLine(x);
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		new PascalsTriangle().showEntireTriangle();
	}
}