package isNumberFactorion;
import java.util.*;
public class findIsNumberFactorion {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  int x; 
		  int factorial = 1;
		  int result = 0;
	
		  System.out.println("Bir sayi giriniz:");
		  x = input.nextInt(); 
		  int number = x;
		  while(x>0){
		   for(int i = 1; i <= x % 10 ; i++)
	        {
	            factorial = factorial * i;
	        }
           result += factorial;
           factorial = 1; 
           x = x / 10; 
		 }	
		  
		  	System.out.println(number);
	  		System.out.println("Sonuç :" + result);

		  if(result == number) {
			  System.out.println("Sayı faktoriyendir.");
		  }else {
			  System.out.println("Sayı faktoriyen değildir.");

		  }
		  input.close();
		 }
	}


