package JavaProgram;

import java.util.Arrays;

public class Practise_1 {

	 public static void main(String[] args) {
		
		 int a[]= {3,5,4,1,2};
		 
		 int temp;
		 for (int i = 0; i < a.length; i++) {
			for (int j = 1+i; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		 System.out.println(Arrays.toString(a));
		 
		 for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		 System.out.println(Arrays.toString(a));
		 
		 int max=a[0];
		 
		 for (int i = 1; i < a.length; i++) {
			if(max<a[i])
				max=a[i];
		}
		 System.out.println(max);
		 
	 int min=a[0];
		 
		 for (int i = 1; i < a.length; i++) {
			if(min>a[i])
				min=a[i];
		}
		 System.out.println(min);
	}
}
