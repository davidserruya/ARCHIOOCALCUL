package exception;

@SuppressWarnings("serial")
public class CalculatriceException extends Exception {

	private final int code;
	private final String defaultMessage;

	public CalculatriceException(int code, String defaultMessage) {
		super();
		this.code = code;
		this.defaultMessage = defaultMessage;
	}

	public int getCode() {
		return code;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}
}
