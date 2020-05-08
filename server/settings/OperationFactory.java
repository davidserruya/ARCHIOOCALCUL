package settings;

import exception.CalculatriceException;
import exception.ExceptionEnum;
import model.Operation;

public class OperationFactory {

	public static Operation initOperation(String ope) throws CalculatriceException {
		ApplicationConfiguration.configuration();
		if (!ApplicationConfiguration.operationByChar.containsKey(ope)) {
			throw new CalculatriceException(ExceptionEnum.UNKNOW_OPERATION.getCode(),
					ApplicationProperties.readProperty(
							ExceptionEnum.getNameFromCode(ExceptionEnum.UNKNOW_OPERATION.getCode()),
							ExceptionEnum.UNKNOW_OPERATION.getDefaultMessage()));

		}
		return ApplicationConfiguration.operationByChar.get(ope);
	}
}
