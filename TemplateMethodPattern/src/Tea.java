import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverages{

	@Override
	void brew() {
		System.out.println("Brewing Tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding lemon");
	}	
}
