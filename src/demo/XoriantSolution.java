package demo;

import java.util.Scanner;

public class XoriantSolution {
	public static void main(String[] args) {
		System.out.print(processArray());
	}
	
	public static int processArray() {
		Scanner sc = new Scanner(System.in);
		int num=0, reqNum=0;
		
		while(num>=0){
			num=sc.nextInt();
			if(num>=100) {
				reqNum=num;
			}
		}
		
		sc.close();
		
		return reqNum;	
	}
}
