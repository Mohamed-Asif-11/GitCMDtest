package program4;

import java.util.Scanner;

public class Minascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n;
		char ch='\0';
		n=sc.nextLine();
		char arr[]=n.toCharArray();
		int min=1000,val;
		for(int i=0;i<arr.length;i++)
		{
			val=(int)arr[i];
			if(min>val)
			{
				min=val;
				//ch=arr[i];
				ch=(char)min;
			}
		}
		System.out.println(min);
		System.out.println(ch);
		
		
		
		
	}

}
