import java.io.*;

public class Calculator {
	
	public void calculate(int n1, int n2, String opertor)
	
	{
		if(opertor.equals("+"))
		{
			System.out.println(n1+n2);
		}
		
	}

	public static void main(String[] args) throws IOException{
		
		Calculator c = new Calculator();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter num1");
		int num1 = Integer.parseInt(br.readLine().trim());
		
		System.out.println("Enter num2");
		int num2 = Integer.parseInt(br.readLine().trim());
		
		
		System.out.println("Enter oper");
		String oper = br.readLine().trim();
		
		c.calculate(num1, num2, oper);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
