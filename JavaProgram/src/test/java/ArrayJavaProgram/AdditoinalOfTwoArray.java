package ArrayJavaProgram;

import java.util.Arrays;
import java.util.Iterator;

public class AdditoinalOfTwoArray {

	 public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {5,6,7,8};
		
		int[] c=new int[a.length+b.length];
		
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		System.out.println(Arrays.toString(c));
		
		for (int i = 0; i < b.length; i++) {
			c[5+i]=b[i];
		}
		System.out.println(Arrays.toString(c));
		//Arrays.sort(c);
		//System.out.println(Arrays.toString(c));
	}
}
