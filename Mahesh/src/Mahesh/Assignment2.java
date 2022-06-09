package Mahesh;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
	//	
		/*1st. Biggest of 3 numbers Input number 7,5,9: 
		
Scanner sc =new Scanner(System.in);
		System.out.println("enter biggest values");
		
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		int c=sc.nextInt();
		
				
		if (a==b && a==c) {
			System.out.println("all numbers same");
			
		}
		else if (a>b && a>c) {
			System.out.println(a);
			
		}
		else if (b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		} 
		*/
	/*  2nd. Sum of N natural numbers input:5 Output:15;//(1+2+3+4+5)
	 Scanner  sc = new Scanner(System.in);
	System.out.println("enter arry values");
	int size =sc.nextInt();
	int add=0;
	for (int i=1; i<=size; i++) {
		
	add=add+i;
	}
	System.out.println(add);
	}
*/
		
		/*4.  Diamond pattern  
	
	Scanner sc=new Scanner(System.in);
		System.out.println("n value");
		
		int n=sc.nextInt();
		
	for (int i=1; i<=n; i++) {
		for (int j=i; j<=n; j++) {
			System.out.print(" ");
		}
		for(int j =1; j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
		
	
	for (int i=1; i<=n; i++) {
		for (int j=1; j<=i; j++) {
			System.out.print(" ");
		}
		for(int j =i; j<=n;j++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
		
		*/
		/*5. half diamond
	
		Scanner sc=new Scanner(System.in);
		System.out.println("n value");
		
		int n =sc.nextInt();
		for (int i=1; i<n; i++) {
			for (int j=1; j<=i; j++){
			System.out.print("* ");
		}
	System.out.println();
	}
		
		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++){
			System.out.print("* ");
		}
	System.out.println();
	}
	
		*/
		
//		7.char a latters print
		
		/*   	for (char i='A'; i<='F'; i++) {
				for (char j='A'; j<=i; j++) {
					System.out.print(j);
				}
			System.out.println();
			
			}
			
			*/
		
		// 8.  101010101
	/*
		Scanner sc=new Scanner(System.in);
		System.out.println("n value");
		
		int n =sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=0; j<n; j++){
				System.out.print(((i+j)%2)+" ");
				}
	System.out.println();
	}
		*/
	

		//	9.   1 to15 sum
		/*
			Scanner sc=new Scanner(System.in);
			System.out.println("n value");
			
			int n=sc.nextInt();
			int p=1;
			for (int i=1; i<=n; i++) {
				for (int j=1; j<=i; j++) {
					System.out.print(p++ +" ");
				}
			System.out.println();
			
			}
			*/
		
//		10. increasing pattern n times
/*
	Scanner sc=new Scanner(System.in);
		System.out.println("n value");
		
		int n =sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
		System.out.println();
		}}
		*/
			

		//11. * half diamond double star
		
/*	Scanner sc=new Scanner(System.in);
		System.out.println("n value");
		
		int n=sc.nextInt();
		for (int i=1; i<n; i++) {
			for (int j=2; j<=i; j++) {
				System.out.print("**");
			}
		System.out.println("*");
		
		}
		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n-1; j++) {
				System.out.print("**");
			}
		System.out.println("*");
		
		}
		*/
			
		//12. find the largest and smallest element in the arry
	/*	int arr[]= {56, 16, 3, 0, 27};
		int large=arr[0];
		
		int small=arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i]> large) {
				large=arr[i];
			}
			else if (arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println(large);
		System.out.println(small);
			
		
		}
		
//15. L pattern
/*	
Scanner sc=new Scanner(System.in);
System.out.println("enter values");
		int n=sc.nextInt();
			for (int i=1; i<n; i++) {
				System.out.println("*");
		}
		for (int i=1; i<=n; i++) {
			System.out.print("* ");
			
		}
		*/
	//	16. 1,3,5
	/*
		Scanner sc=new Scanner (System.in);
		System.out.println("input value");
		int n=sc.nextInt();
		for (int i=1; i<=n; i++) {
			
			if ((i%2)==1) {
				for(int k=4; k>=i; k--) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print(i+" ");
				}
			
				System.out.println();
				
			}
		
	}*/
		/*  Scanner sc=new Scanner (System.in);
		System.out.println();
		int n=sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=n; j>=1; j--) {
				if (i>=j) {
					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for (int i=1,p='A'; i<=n; i++,p++) {
			for (int j=i; j<=n; j++) {
				System.out.print("  ");
			}
				for (int j=1; j<=i; j++ ) {
				System.out.print( (char)p+" ");
			}
			System.out.println();
		}
	}}
	
	
