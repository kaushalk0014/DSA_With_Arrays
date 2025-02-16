package IntStream;

import java.util.Iterator;
import java.util.stream.IntStream;

public class UsingIntStreamRange {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 50, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		
		
		
		
		int reverseArr[]=IntStream.range(0, arr.length)
				//.peek(System.out::println)
		.map(num-> arr[arr.length-1-num]).peek(System.out::print).toArray();
		
		System.out.print("Reverse array :");
		for(int num : reverseArr) {
			System.out.print(num +" ");
		}
	}
}
