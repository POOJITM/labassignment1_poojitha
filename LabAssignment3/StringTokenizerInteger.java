/**
Author:Poojitha
Date:23/10/2020
Desc:Display each inetger and sum of integers
*/
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerInteger {

public static void main(String[] args) {
// TODO Auto-generated method stub
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the integers");
String s=sc.nextLine();
StringTokenizer st=new StringTokenizer(s);
while(st.hasMoreTokens()) {//Method to check availability of token
String temp=st.nextToken();//Storing the tokens in the temp
n=Integer.parseInt(temp);//Converts string to integer
System.out.println(n);
sum=sum+n;

}
System.out.println("Sum of the integers: "+sum);
}

}
