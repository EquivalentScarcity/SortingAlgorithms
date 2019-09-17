package lokesh.sort;

public class InsertionSort {

	public static void main(String[] args) {

		int A[] = { 12, 13, 4, 1, 2 };

		int B[] = insertionSort(A, 5);

		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}

	}

	// A is the input matrix and n is size of the matrix
	public static int[] insertionSort(int[] A, int n) {

		// [12, 13, 4, 1 , 2]

		for (int i = 1; i < n; i++) {

			int value = A[i];
			int hole = i;

			// shift all the elements greater than hole one step right
			// and move the i th element to its corresponding place in the sorted Array

			while (hole > 0 && A[hole - 1] > value) {

				A[hole] = A[hole - 1];
				hole = hole - 1;

			}
			A[hole] = value;

		}

		return A;

	}

}
