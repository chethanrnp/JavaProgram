package ArrayJavaProgram;

import java.util.Arrays;
import java.util.Iterator;

public class FmaxAndSmaxWithBubble {


	 public static void main(String[] args) {
		 int a[]= {20,30,10,50,40};
			
			int temp;
			for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			}
			System.out.println("Fmax="+a[0]+",Smax="+a[1]);
	}
}
