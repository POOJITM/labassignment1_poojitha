package poweroftwo;
import java.util.Scanner;
public class poweroftwo {

		    static boolean checkNumber(int n)
		        {
		            if (n == 0)
		                return false;

		            while (n != 1)
		            {
		                if (n % 2 != 0)
		                    return false;
		                n = n / 2;
		            }
		            return true;
		        }


		        public static void main(String[] args)
		        {
		            System.out.println("Enter a number to check:");
		            Scanner sc=new Scanner(System.in);
		            int n=sc.nextInt();
		            System.out.println(checkNumber(n));
		        }
		    
	}


