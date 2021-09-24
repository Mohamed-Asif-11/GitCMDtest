package program4;
import java.util.Scanner;

public class Maxascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c='\0';
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int max=0,val;
		for(int i=0;i<arr.length;i++)
		{
			val=(int)arr[i];
			if(val>max)
			{
				max=val;
				c=arr[i];
			}
		}
		System.out.println(c);
		System.out.println(max);	

	}

}
