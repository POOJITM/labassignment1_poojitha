import java.util.Scanner;
public class TrafficLights {
	public static void TrafficLights(String str) {
		if(str.equalsIgnoreCase("red")==true) {
			System.out.println("Stop");
		}
		else if(str.equalsIgnoreCase("yellow")==true) {
			System.out.println("ready");
		}
		else if(str.equalsIgnoreCase("green")==true) {
			System.out.println("go");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the choice");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        TrafficLights(str);
	}

}
