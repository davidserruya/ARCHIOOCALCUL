package controller;

import exception.CalculatriceException;
import model.Operation;
import model.OperationModel;
import settings.OperationFactory;

public class Calculate {

	public static OperationModel calculate(OperationModel operation) {
		Operation model;
		try {
			model = OperationFactory.initOperation(operation.getOperation());

			operation.setResult(model.calculer(operation.getX(), operation.getY()));
		} catch (CalculatriceException e) {
			operation.setError(e.getDefaultMessage());
			operation.setErrorCode(e.getCode());
		}
		return operation;
	}

}
