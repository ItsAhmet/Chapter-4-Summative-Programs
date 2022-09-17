import java.util.Scanner; 
public class Dictionary {


	public static void main(String[] args) 

	{

		String word1;
		String word2;
		String word3;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter first word -->");
		word1=keyboard.nextLine();
		
		System.out.print("Enter second word -->");
		word2=keyboard.nextLine();
		
		System.out.print("Enter third word -->");
		word3=keyboard.nextLine();
	    
	    
	    
		if((word1.compareTo(word2) < 0) && (word1.compareTo(word3) < 0)){
	    	
				System.out.println(word1);
				if (word2.compareTo(word3) < 0){
					
					System.out.println(word2);
					System.out.println(word3);
					
				}else{
					
					System.out.println(word3);
					System.out.println(word2);
					
				}
		}
		
		
		
		else if((word1.compareTo(word2) > 0) && (word2.compareTo(word3) < 0)){
			
			System.out.println(word2);
			if (word1.compareTo(word3) < 0){
				
				System.out.println(word1);
				System.out.println(word3);
			
			}else{
			
				System.out.println(word3);
				System.out.println(word1);
			
			}
			
			}else{

			System.out.println(word3);
			if (word1.compareTo(word2) < 0){
				
				System.out.println(word1);
				System.out.println(word2);
				
			}else{
				
				System.out.println(word2);
				System.out.println(word1);
			}
		}
	}
}
