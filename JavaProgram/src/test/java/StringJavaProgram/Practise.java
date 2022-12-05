package StringJavaProgram;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Practise {

	 public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);
	        System.out.println("enter the string");
	        String c = s.next();
	        
	        String rev="";
	        
	        for (int i = c.length()-1; i>=0; i--) {
				rev=rev+c.charAt(i);
			}
	        
	        System.out.println(rev);
 	 }
}
