package day02;
import java.util.Scanner;

public class D02P08 {
	public static void main ( String args[]) {
		Scanner scanner =new Scanner(System.in);
		int l=scanner.nextInt();
		int r=scanner.nextInt();
		int k=l;
		int n=0;
		if(0<=l&&l<=r) {
			while(k<=r) {
				n+=k;
				k+=1;
				
			}
				
		}
		System.out.println("Sum of"+" "+ n);
		
	}

}