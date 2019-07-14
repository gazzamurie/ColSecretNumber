/*
 * Project Name: SecretNumber
 * Author: G Murie
 * Date: 21/10/14
 */

import java.io.* ;


public class SecretNumber {
	
	private static int userInput;
	private static String entString;
	private static BufferedReader bufRead;
	int total = 1;
	
	public static void main(String[] args) {
	
	//Declare the local variable to hold the randomly generated number
		int secretNumber;
		// Generate a random number between 1 and 1000
		secretNumber = (int) (Math.random() * 999 + 1);
		
		
			InputStreamReader istream = new InputStreamReader(System.in) ;
		bufRead = new BufferedReader(istream) ;
		
	System.out.println("The Computer Has Thought Of A Number All You Have To Do Is Geuss What It Is, (Between 1 and 1000)");
	
do{

	System.out.println("Try And Geuss The Number: ");
	try {
	entString = bufRead.readLine();
	userInput = Integer.parseInt(entString);
	} catch (IOException e) {
	e.printStackTrace();
	}	
	
     if (userInput > secretNumber)  
    		 System.out.println("Your Guess Is To High");
     else 
     if (userInput < secretNumber)
             System.out.println("Your Guess Is To Low");
     else
    	 if (userInput == secretNumber)
    		 System.out.println ("YOU GEUSSED CORRECTLY, CONGRATULATIONS!");
               } while (userInput != secretNumber);
          }
	}
	
