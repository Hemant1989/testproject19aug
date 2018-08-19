package testpackage;

import java.io.File;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {

		int a = 10+1;
		int b = 0;
		System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter c1");
		int c1= sc.nextInt();

		// ArithmeticException / by 0
		try{
			b= 10/c1;
			System.out.println(b);
		}
		catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		int c = 10*3;
		System.out.println(c);

		//NullPointerException
		//		String str = null;
		//		System.out.println("string length " + str.length());
		//		
		//		int arr[]= new int[4];
		//		arr[0] = 100;
		//		arr[1] = 100;
		//		arr[2] = 100;
		//		arr[3] = 100;

		//ArrayIndexOutOfBoundsException
		//		arr[4] = 100;



		

	}

}
