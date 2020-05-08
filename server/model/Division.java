package model;

import exception.CalculatriceException;
import exception.ExceptionEnum;
import settings.ApplicationProperties;

public class Division extends Operation {

	@Override
	public double calculer(double x, double y) throws CalculatriceException {
		if (y == 0) {
			throw new CalculatriceException(ExceptionEnum.DIVISION_BY_ZERO.getCode(),
					ApplicationProperties.readProperty(
							ExceptionEnum.getNameFromCode(ExceptionEnum.DIVISION_BY_ZERO.getCode()),
							ExceptionEnum.DIVISION_BY_ZERO.getDefaultMessage()));
		}
		return x / y;
	}
}
