//Name: Ahmet Yesilbas
//Project Name: Roulette pocket
//Date: 2/20/2022
//Project Description: A program that tells what a numbers pocket it is 


import java.util.Scanner;
public class RoulettePocket{
	
	public static String getColor(int pocket){
		String color = null;

	if (pocket == 0){
		
		color = "Green";
	}

	if ((pocket >= 1) && (pocket <= 10)){
		
		if (pocket % 2 == 0){
			color = "Black";
			
	}else{
		
	    color = "Red";
	    
		}
	}

	
	
	if ((pocket >= 11) && (pocket <= 18)){
		
		if (pocket % 2 == 0){
			color = "Red";
			
	}else{
		
		color = "Black";

		}
	}
	
	
	
	if ((pocket >= 19) && (pocket <= 28)){
		
		if (pocket % 2 == 0){
			color = "Black";
			
	}else{
		
	    color = "Red";
	    
		}
	}
	
	
	
	if ((pocket >= 29) && (pocket <= 36)){
		
		if (pocket % 2 == 0){
			color = "Red";
			
	}else{
		color = "Black";
		
		}
	}

	return color;
	}
	
	
	
	
	
	

	
	public static void main(String[]args){
    	int input;
    	String result;
    	
    	
    	Scanner scan= new Scanner(System.in);
    	
    	
    	System.out.println("Enter a number between 0 and 36 --> ");
    	input = scan.nextInt();
    	
    	
    	if ((input >= 0) && (input <= 36)){
    		
    		result = getColor(input);
    		System.out.println("Pocket is "+result);
    		
    	}else{
    		
    System.out.println("Invalid entry, only enter a number between 0 and 36.");
    
    }

}

}