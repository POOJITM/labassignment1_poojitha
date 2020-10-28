/**
Author:Poojitha
Date:23/10/2020
Desc:check whether the given string is a positive string or not.
*/
import java.util.*;
public class PositiveNumber {
public static String checkPositive(String str) {
for(int i=0;i<str.length()-1;i++) {
if(str.charAt(i)<str.charAt(i+1)) {
System.out.println("The given string is a positive string");
} else {
System.out.println("The given string is a negative string");
}
}
return str;
}

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("Enter the String:");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String str=checkPositive(s);

}

}