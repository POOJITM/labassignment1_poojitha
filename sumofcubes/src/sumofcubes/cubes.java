package sumofcubes;
import java.util.Scanner;
public class cubes {
	public static int sumOfCube(int number) {
		int sum=0;
		while(number!=0) {
			int digit=number%10;
			sum=sum+(digit*digit*digit);
			number=number/10;
		}
		return sum;
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number= sc.nextInt();
		sc.close();
		System.out.println(sumOfCube(number));
    }
}