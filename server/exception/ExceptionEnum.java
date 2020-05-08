package exception;

import settings.ApplicationProperties;

public enum ExceptionEnum {
	DIVISION_BY_ZERO(1, ApplicationProperties.readProperty("DIVISION_BY_ZERO", "Error 1")),
	UNKNOW_OPERATION(2, ApplicationProperties.readProperty("UNKNOW_OPERATION", "Def")),
	METHOD_NOT_IMPLEMENTED(3, ApplicationProperties.readProperty("METHOD_NOT_IMPLEMENTED", "Def")),
	OPERAND_IS_NOT_INTEGER(4, ApplicationProperties.readProperty("OPERAND_IS_NOT_INTEGER", "Def")),
	INPUT_MISMATCH(5, ApplicationProperties.readProperty("INPUT_MISMATCH", "Def")),
	SERVER_ERROR(6, ApplicationProperties.readProperty("SERVER_ERROR", "Def"));

	private final int code;
	private final String defaultMessage;

	ExceptionEnum(int code, String defaultMessage) {
		this.code = code;
		this.defaultMessage = defaultMessage;
	}

	public int getCode() {
		return code;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	public static String getNameFromCode(int code) {
		for (ExceptionEnum e : ExceptionEnum.values()) {
			if (code == e.code) {
				return e.name();
			}
		}
		return null;
	}
}
