package lab03;

import java.util.Arrays;

public class UpSort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {5,4,9,2,7};
		arraysort();
	}
	public static void arraysort(){
		int[] a = {5,4,9,2,3,7};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
