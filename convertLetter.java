/* 
	Self test chapter 2: convert letters 
	from upper to lower case and vice versa.
	
	My solution. 

*/

class convertLet {
	
	char userInput, outChar;
	int charCheck, charChange;
	
	convertLetter(userIn) {
		
		userInput = userIn;
	}
	
	charCheck = (int) userInput;
	
	if (charCheck > 65 && charCheck < 90){
				
				charChange = userInput + 32;
				outChar = (char) charChange;
				changes ++;
				System.out.println("Changed to: " + outChar);
				System.out.println("");
				System.out.println("========================");
				return outChar;
			}
			
			else if (charCheck > 97 && charCheck < 122 ) {
				
				charChange = userInput - 32;
				outChar = (char) charChange;
				changes ++;
				System.out.println("Change to: " + outChar);
				System.out.println("");
				System.out.println("========================");
				return outChar;
			}
			
			else {
				System.out.println("=================\n");
				System.out.println("That is not a valid character to change.\n\nPlease try again.\n");
				System.out.println("=================\n");
				return false;
			}
	
class convertLetter {
	
	public static void main(String args[])
	throws java.io.IOException {
		
		char userInput, outChar;
		int  userBreak, changes = 0;
		
		convertLet cVerter = new convertLet;
		
		do {
			
			System.out.println("Please enter letter to change?\n");
			System.out.println("Press . to stop\n");
			
			userInput = (char) System.in.read();
			userBreak = System.in.read();
			convertLet(userInput);
			
			if (userInput == '.'){
				break;
			}
					 
		}while(userInput != '.');
		
		System.out.println("\nYou made " + changes + " case changes.\n");
		System.out.println("Thanks for using my program.\n");
	}
}
