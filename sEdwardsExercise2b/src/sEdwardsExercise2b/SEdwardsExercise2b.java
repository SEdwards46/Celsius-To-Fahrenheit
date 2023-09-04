/**
 * 
 */
package sEdwardsExercise2b;
import java.util.Scanner;
/**
 * @author ShaneEdwards
 *         
 *         Due: 9/26/2022
 *         
 *         This program converts Fahrenheit to Celsius and vice versa.
 *         
 *         This is my own work with the following exceptions:
 *         None 
 *
 */
public class SEdwardsExercise2b {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float temp;
		System.out.print("Enter the temperature in Fahrenheit ");
		temp = sc.nextFloat();
		temp = ((temp-32) * 5/9);
		System.out.print("This is equivalent to ");
		System.out.format("%.1f",temp);
		System.out.println(" Celsius");
		
		float Temp;
		System.out.print("Enter the temperature in Celsius ");
		Temp = sc.nextFloat();
		Temp = ((Temp*9/5) + 32);
		System.out.print("This is equivalent to ");
		System.out.format("%.1f",Temp);
		System.out.println(" Fahrenheit");
		
		
		
		}
		}
		

			
	  

	


