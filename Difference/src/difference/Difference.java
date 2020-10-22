package difference;
import java.util.Scanner;
public class Difference {
	public static int calculateDifference(int n) {
		int sum1=0,sum2=0;
		sum1=(n*(n+1)*((2*n)+1))/6;
		for(int i=1;i<=n;i++) {
			sum2=sum2=+i;
		}
		sum2=sum2*sum2;
		return sum1-sum2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calculateDifference(n));
	}

}
