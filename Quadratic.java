import java.util.Scanner;


public class Quadratic 
{
	public static void main(String[] args)
	{
		double a, b, c, d, x1, x2;
		a = 4;
		b = 8;
		c = 3;
		
		//(B^2 - 4 * A * C) that is inside the square root will equal d
		d = b * b - 4.0 * a * c; 
		

		
		if (d > 0.0) //There are 2 Roots
		{
	
			
			//Plus Version of the equation.
			x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
			
			//Minus Version, we use both to calculate root.
			x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
			
			//Now we print result
			System.out.println("The roots are: " + x1 + " and " + x2);
			
		} 
			else if(d == 0.0) //There is one root.
			{
					
					x1 = -b / (2.0 * a);
					
					System.out.println("The root is: " + x1);
					
					
			} 
				else //there are no Roots possible in this equation so we send the following message
				{ 
						
					System.out.println("Zero roots: No real roots");
						
				}
		
	
	
	}
}

