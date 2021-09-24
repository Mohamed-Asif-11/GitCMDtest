package program4;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the Number:");
		int num=sc.nextInt(),temp;
		int n,rev=0,pow=10;
		temp=num;
		while(num>0)
		{
			n=num%10;
			rev=rev*pow+n;
			//pow*=10;
			num/=10;
		}
		if(temp==num)
		{
		System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");			
		}*/
		int r,sum=0,temp;    
		int n=sc.nextInt();//It is the number variable to be checked for palindrome  
		temp=n;
		if(n>=0)
		{
		while(n>0){    
		r=n%10;  //getting remainder  
		sum=(sum*10)+r;    
		n=n/10;    
		}    
		if(temp==sum)    
		System.out.println("Palindrome");    
		else    
		System.out.println("Not a Palindrome");    
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
				
	}

