/**
Author:Poojitha
Date:23/10/2020
Desc: displaying the number of characters, lines and words in a text.
*/
import java.util.*;
public class Text {
public static int NumberOfCharacters(String s) {
int words=0, ch=0, line=1;
for(int i=0;i<s.length();i++) {
if(s.charAt(i)==' ') {
words++;//displays no of words
}
if(s.charAt(i)=='\n') {
line++;//displays no of lines
}
ch++;//displays no of characters
}
System.out.println("Number of Characters are:"+ch);
System.out.println("Number of words are:"+words);
System.out.println("Number of lines are:"+line);
return line;
}

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("Enter the text");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int s=NumberOfCharacters(str);

}

}
