package demo;

import java.util.HashSet;
public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {4,1,7,3};
		int arr2[]= {5,4,7,8};
		
		printIntersection(arr1,arr2);

	}
	
	public static void printIntersection(int[] arr1, int[] arr2) {
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			hs.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(hs.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
	}
}
