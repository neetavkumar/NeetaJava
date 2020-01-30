package stringdemo;
//Program to display a string in half pyramid pattern///
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string to be printed as half pyramid:");
	String st=sc.next();
// to convert string to character array- toCharArray method is used//	
//	char ch[]=st.toCharArray();
//	for(int i=0;i<ch.length;i++)
//	{
//	 for(int j=0;j<=i;j++)
//	 {
//	  System.out.print(ch[j] +" ");		  
//	 }
//	 System.out.println();
//	}
//	sc.close();
//                    OR
// another method/////	
	 
	 int l= st.length();
	 for(int i=0;i<=l;i++)
	 {
//to print the substring of the string in half pyramid pattern///		 
		 System.out.println(st.substring(0, i));
	 }
	 sc.close();
 }

}
