/**
Author:Poojitha
Date:23/10/2020
Desc:replacing all the consonants with the next character.
*/
import java.util.*;
public class ReplaceConsonants {
public static String alterString(String s1) {
String s = s1.toLowerCase();
int n=s.length();//length of the string
for(int i=0;i<n;i++) {
char c=s.charAt(i);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
System.out.print(c);//prints as it is if it is a vowel
} else {
char ch=s.charAt(i);
ch++;
System.out.print(ch);//prints the next immediate character if it is a consonant
}
}
return s;
}

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("Enter the String: ");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String s=alterString(str);

}

}


