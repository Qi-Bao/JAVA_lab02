package lab03;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		int[] b = new int[5];
		int[] c = new int[10];
		System.out.print("C is ");
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			System.out.print(c[i] + ",");
		}
		System.out.println(" ");
		System.out.print("B is ");
		System.arraycopy(a, 2, b, 0, 5);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ",");
		}

	}

}
