package hashmap;
//
//     Author : M.Poojitha
//     Date   : 05-11-2020
//     Desc   : Accept a map with ID as key and Date of Birth as value 
//              and check if the person is eligible to vote. A person is eligible
//              for vote for if his age is greater than 18. If the person is eligible
//              add his ID to the list. 
//
//
//
import java.util.*;

public class VoterList {
	public static void main(String[] args) {
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();
		voterList.put(101, 38);
		voterList.put(102, 15);
		voterList.put(103, 27);
		voterList.put(104, 69);
		List<Integer>voterDetails=votersList(voterList);
		System.out.println(voterDetails);
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterList) {
		List<Integer> voterDetails=new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) {
			if(entry.getValue()>18) {
				voterDetails.add(entry.getKey());
			}
		}
		return voterDetails;
	}

}