import java.util.*;
public class SortMinMax {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = {1,5,6,9,7,2};
		Arrays.sort(arr);
		System.out.println("The min value is: "+ arr[0]);
		System.out.println("The min value is: "+ arr[arr.length-1]);

	}

}
