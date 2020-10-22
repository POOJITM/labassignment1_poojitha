package primenumbers;
import java.util.Scanner;


public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j,count,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(j=1;j<=n;j++) {
        	count=0;
        	for(i=2;i<=j/2;i++) {
        		if(j%i==0) {
        			count++;
        			break;
        		}
        	}
        	if(count==0 && j!=1) {
        		System.out.println(j +" ");
        	}
        }
	}

}
