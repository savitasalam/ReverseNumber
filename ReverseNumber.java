//1. by using append and reverse method of StringBuilder class.


/*
import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a positive numner");
		int n=sc.nextInt(); //1234
		
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(n)); //converts the number in string format
		
		rev=sb.reverse(); //reverse() is the method of StringBuffer class.
		System.out.println("The Reversed Number is "+rev);
	}
}
*/


//2. by using multiplication,Addition ,division.
/*
import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[] args)
	  {
    	int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a positive numner");
		int n=sc.nextInt(); //1234
		
		while(n!=0)
		{
			rev=rev*10 + n%10;
			n=n/10;
		}
		
		System.out.println("The Reversed Number is "+rev);
	}
}

*/







//3. using StringBuffer class 
/*
import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a positive numner");
		String n=sc.nextLine(); //1234
		
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(n);   //converts the number in string format
		//sb.append(n);
		
		rev=sb.reverse(); //reverse() is the method of StringBuffer class.
		
		System.out.println("The Reversed Number is "+rev);
	}
}

*/




// 4. reverse number using Recursion method. 
import java.util.Scanner;
public class ReverseNumber
{
	
 public static void reverseMethod(int n)
 {
	 if(n<10)
	 
		 System.out.println(n);
	 else
	 {
		 System.out.print(n%10);
	     reverseMethod(n/10);
	 }
 }
    public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a positive number   : ");
		int n=sc.nextInt(); //1234
		System.out.print(" Reversed of given  Number :");
		reverseMethod(n);
	}
}