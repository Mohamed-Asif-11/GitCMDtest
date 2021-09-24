package program4;

import java.util.Scanner;

public class Sumofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();scn.nextLine();
		int digit,sum=0;
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
	}

}
