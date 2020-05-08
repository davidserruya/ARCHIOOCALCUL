package settings;

import java.util.HashMap;
import java.util.Map;

import model.Addition;
import model.Division;
import model.Operation;
import model.Soustraction;
import model.Multiplication;

public class ApplicationConfiguration {
	public static Map<String, Operation> operationByChar = new HashMap<>();

	public static void configuration() {
		operationByChar.put("+", new Addition());
		operationByChar.put("-", new Soustraction());
		operationByChar.put("/", new Division());
		operationByChar.put("*", new Multiplication());
	}
}
