/**
Author:Poojitha
Date:23/10/2020
Desc:Find the mirror image of the String
*/
import java.util.*;
public class MirrorImage {
public static String getImage(String r) {
int n=r.length();//length of the string
System.out.print(r);//prints original string
System.out.print("|");
for(int i=(n-1);i>=0;i--) {
System.out.print(r.charAt(i));//prints mirror image of the string
}
return r;
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String str=sc.nextLine();
String r=getImage(str);

}

}
