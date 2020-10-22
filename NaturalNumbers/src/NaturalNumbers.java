import java.util.*;
public class NaturalNumbers {
		public static int calculateSum(int n) {
			int sum=0;
			for(int i=1;i<=n;i++) {
				if(i%3==0 || i%5==0) {
					sum=sum+i;
				}
			}
			return sum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calculateSum(n));
	}
}
