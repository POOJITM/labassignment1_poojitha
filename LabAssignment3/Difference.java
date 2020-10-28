/**
Author:Poojitha
Date:23/10/2020
Desc:difference between two consecutive digits in the original number.
*/
import java.util.*;
public class Difference {
public static int modifyNumber(int r) {
int sum=0;
int h=r%10;
while(r!=0) {
int a=r%10;
sum=sum * 10 + a;
r=r/10;
}
//System.out.println(sum);
while(sum!=0) {
int k=sum%10;
sum=sum/10;
int l=sum%10;
int res=k-l;
System.out.print(Math.abs(res));
}
return r;
}

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=modifyNumber(n);

}

}

