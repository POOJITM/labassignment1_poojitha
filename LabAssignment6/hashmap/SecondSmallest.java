package hashmap;
//
//   Author : M.Poojitha
//   Date   : 05-11-2020
//   Desc   : Create a method which accepts an array of integer elements
//            and return the second smallest element in the array.
//
//
//
import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		Integer numArray[]= {52,74,12,59,63,57};
		int secondSmallestElement=getSecondSmallest(numArray);
		System.out.println("Second Smallest element is : "+secondSmallestElement);
	}

	private static int getSecondSmallest(Integer[] numArray) {
		List<Integer> element=Arrays.asList(numArray);
		Collections.sort(element);
		System.out.println("Sorting Array\n"+element);
		Integer secondSmallest=element.get(1);
		return secondSmallest;
	}

}