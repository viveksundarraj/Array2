package Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("vivek");
		StringBuffer sb2=new StringBuffer("gokul");
		StringBuffer sb1= sb2.reverse();
		
		 System.out.println(sb1);
		 
		 if(sb.equals(sb1))
		 {
			 System.out.println("hi");
		 }
		 else
		 {
			 System.out.println("hello");
		 }
		

	}

}
