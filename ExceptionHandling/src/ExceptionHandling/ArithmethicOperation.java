package ExceptionHandling;
import java.util.Scanner;

public class ArithmethicOperation {

	public void performOperation()
	{
		
		
		try {
			
			String x,y;
			Scanner input=new Scanner(System.in);
			
			x=input.nextLine();
			y=input.nextLine();
			long a=Long.parseLong(x);
			long b=Long.parseLong(y);
			
			if(a<Integer.MIN_VALUE || a>Integer.MAX_VALUE || b<Integer.MIN_VALUE || b>Integer.MAX_VALUE)
			{
				throw new OutofRange("integer out of range");
			}
			
			char op;
			op=input.next().charAt(0);
			
			long result=0;
			if(op=='+')result=a+b;
			else if(op=='-')result=a-b;
			else if(op=='*')result=a*b;
			else if(op=='/')
				{
					if(b==0)
						throw new ArithmeticException("Can't divide by zero");
					result=a/b;
				}
			else throw new IllegalArgumentException("Illegal Argument");
			if(result<Integer.MIN_VALUE || result>Integer.MAX_VALUE)
				throw new OutofRange("Result is out of range");
			
			System.out.println("The program is executed successfully without encounter any Exception");
			System.out.println("result: " +result);
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Number Format. "+e.getMessage());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		catch(OutofRange e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
