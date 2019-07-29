import java.util.Scanner;

public class ChotaCalculator {
	
	
	public static int add(int x , int y )
	{    System.out.println("teri");
		return x+y;
	}
	public static int subtract(int x , int y )
	{
		return x-y;
	}
	public static int multiply(int x , int y )
	{
		return x*y;
	}
	public static int divide(int x , int y )
	{
		return x/y;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	    System.out.println(add(a,b));
        System.out.println(subtract(a,b));
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
        
	}
	
	
}
