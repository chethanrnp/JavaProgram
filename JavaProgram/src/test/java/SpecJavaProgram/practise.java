package SpecJavaProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class practise {

	 public static void main(String[] args) {

		 String c="Java Is Easy";
		 System.out.println(c.length());
		 String  Uper="";
		 String  low="";
		 System.out.println(c.length());
		 for (int i = 0; i < c.length(); i++) {
		//	 char c1=c.charAt(i);
			if (c.charAt(i)>=65&&c.charAt(i)<=90) {
				Uper=Uper+c.charAt(i);
			}
			else {
				low=low+c.charAt(i);
			}
			
		}
		 System.out.println(Uper);
		 System.out.println(low);
		 String[] l = low.split(" ");
		 System.out.println(Arrays.toString(l));
		 for (int i = 0; i < l.length; i++) {
			System.out.print(l[i]);
		}
 }
 }
