import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverages{

	@Override
	void brew() {
		System.out.println("Brewing Coffee");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	// Overriding the hook method
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}else {
			return false;
		}
	}
	
	// Asks the user if he would like milk and sugar
	private String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		}catch(IOException e) {
			System.out.println("IO error trying to read your answer");
		}
		
		if(answer == null) return "no";
		
		return answer;
	}
	
}
