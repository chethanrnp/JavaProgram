package StringJavaProgram;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Practise {

	 public static void main(String[] args) {

		 
		 String s="Hi Hi Hello Welcome Come";
		  String[] ch = s.split(" ");
		  
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		
		for (String lv : set) {
			int count=0;
			
			for (int i = 0; i < ch.length; i++) {
				if (lv.equalsIgnoreCase(ch[i])) {
					count++;				}
			}
			if (count==1) {
				System.out.println(lv+" "+count);
			}
		}
 	 }
}
