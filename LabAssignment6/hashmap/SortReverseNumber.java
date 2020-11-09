package hashmap;
//
//      Author: M.Poojitha
//      Date  : 05-11-2020
//      Desc  : To create a method which accepts an integer array, 
//              reverse the numbers in the array and returns the resulting array in sorted order.
//
//
//

import java.util.*;


public class SortReverseNumber {
	public static void main(String[] args) {
		
		List<Integer> result=new ArrayList<>(Arrays.asList(74,85,21,93,14));
		List<Integer> reverse = getSorted(result);
		System.out.println("Sorted Reverse Array\n "+reverse);
	}
	
	private static List<Integer> getSorted(List<Integer> result) {
		List<Integer> reverseSorted=new ArrayList<Integer>(result);
		Collections.reverse(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 System.out.println("Reverse Sorted Array\n "+reverseSorted);
		 Collections.sort(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 return reverseSorted;
	}

	
	

}