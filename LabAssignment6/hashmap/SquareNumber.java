package hashmap;
//     
//        Author : M.Poojitha
//        Date   : 05-11-2020
//        Desc   : To create a method which accepts an array of numbers 
//                 and returns the numbers and their squares in Hashmap.
//
//
import java.util.*;

public class SquareNumber {
	public static void main(String[] args) {
		int sqNum[]= {5,6,8,1,4,2};
		Map<Integer,Integer> squareNum=getSquares(sqNum);
		System.out.println(squareNum);
		
	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {
		
		Map<Integer,Integer> squareMap=new HashMap<>();
		for(int square:sqNum) {
			squareMap.put(square,square*square);
		}
		return squareMap;
	}

}