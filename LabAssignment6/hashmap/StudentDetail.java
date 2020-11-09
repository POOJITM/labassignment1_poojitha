package hashmap;
//
//      Author : M.Poojitha 
//      Date   : 05-11-2020
//      Desc   : To return the details of the students eligible for the medals 
//               along with the medal type. 
//
//
//

import java.util.*;

public class StudentDetail {
	public static void main(String[] args) {
		Map<Integer,Integer> student=new HashMap<>();
		student.put(101, 84);
		student.put(102, 99);
		student.put(103, 71);
		Map<Integer,String> medalDetails=getStudents(student);
		System.out.println(medalDetails);
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
		Map<Integer,String> medalDetails=new HashMap<>();
		for(Map.Entry<Integer, Integer> entry:student.entrySet()) {
			if(entry.getValue()>90) {
				medalDetails.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()>80 && entry.getValue()<90) {
				medalDetails.put(entry.getKey(),"Silver");
			}
			else if(entry.getValue()>70 && entry.getValue()<80) {
				medalDetails.put(entry.getKey(),"Bronze");
			}
			
		}
		return medalDetails;
	}

}