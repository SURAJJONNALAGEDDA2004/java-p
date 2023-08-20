import java.util.Scanner;

class Array {

	int n;
	int a[];
	Scanner sob = new Scanner(System.in);

	void arrayInit() {
		System.out.println("Enter Number of Elements: ");
		n = sob.nextInt();
		a = new int[n];
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = sob.nextInt();
		}
	}
	void arrayFindMin() {
		int min = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum Element in Array: " + min);

	}

	void arrayFindMax() {
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum Element in Array: " + max);

	}



	void arraySort() {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}

	void arraySearch() {
		int s;
		boolean found = false;
		System.out.print("Enter Search Element: ");
		s = sob.nextInt();

		for (int i = 0; i < n; i++) {
			if (a[i] == s) {
				found = true;
				System.out.println("Search Element:" + s + " Found in Array. ");
			}
		}
		if (found == false) {
			System.out.println("Search Element " + s + " Not Found  in Array. ");
		}

	}

	void arrayDisplay() {

		System.out.println("Elements in Array: ");
		for (int i : a) {
			System.out.println(i + "\t");
		}
		System.out.println();
	}
}




class m3_0prog5 {

	public static void main(String[] args) {
		Array s = new Array();

		s.arrayInit();
		s.arrayDisplay();
		s.arraySearch();
		s.arrayFindMin();
		s.arrayFindMax();
		s.arraySort();
		s.arrayDisplay();

	}
}

//OUTPUT
/*
Enter Number of Elements: 
5
Enter Array Elements: 
1
8
9
3
5
Elements in Array: 
1
8
9
3
5
 */