package ArrayJavaProgram;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Test;

public  class  Practise {
 
	 public static void main(String[] args) {
		
			int a[]= {1,2,3,4,5};
			
			int k=2;
			for (int j = 0; j < k; j++) {
				int temp=a[0];
				for (int i = 1; i < a.length; i++) {
					a[i-1]=a[i];
				}
				a[a.length-1]=temp;
			}
			
			System.out.println(Arrays.toString(a));
	}
	
}

