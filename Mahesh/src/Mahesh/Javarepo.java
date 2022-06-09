package Mahesh;

import java.util.Scanner;

public class Javarepo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner number=new Scanner(System.in);
			System.out.println("enter values");
			int a=number.nextInt();
			int b=number.nextInt();
			int c=a+b;
			
		System.out.println("addtion = "+c);
		System.out.println("subtraction = " +(a-b));
		System.out.println("multiplication = "+(a*b));
		System.out.println("division = " + (a/b));
		System.out.println("Reminder = " +(a%b));
	}

}
