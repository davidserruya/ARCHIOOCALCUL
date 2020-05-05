package controller;

import model.Operation;
import model.OperationModel;
import settings.OperationFactory;

public class Calculate {

	public static OperationModel calculate(OperationModel operation) {
		Operation model = OperationFactory.initOperation(operation.getOperation());

		operation.setResult(model.calculer(operation.getX(), operation.getY()));

		return operation;
	}

}
