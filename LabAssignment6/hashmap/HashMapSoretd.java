package hashmap;
//
//    Author : M.Poojitha
//    Date   : 05-11-2020
//    Desc   : To create a method which accepts a hash map and return the 
//             values of the map in sorted order as a List.
//
import java.util.*;

public class HashMapSoretd {
	public static void main(String[] args) {
		HashMap <Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "Neha");
		hashMap.put(2, "Nisha");
		hashMap.put(3, "Prateek");
		hashMap.put(4, "Dinesh");
		List<String> sortedHashMap=new ArrayList<String>();
		sortedHashMap=getValues(hashMap);
		System.out.println(sortedHashMap);
		
		
	}

	private static List<String> getValues(HashMap<Integer, String> hashMap) {
		
		List<String> sortedHashMap=new ArrayList<String>();
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			sortedHashMap.add(entry.getValue());
		}
		Collections.sort(sortedHashMap);
		
		return sortedHashMap;
	}

}