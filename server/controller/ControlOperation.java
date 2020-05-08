package controller;

import exception.CalculatriceException;
import model.Operation;
import settings.OperationFactory;
import view.Interface;

public class ControlOperation {
	private Interface view;
	@SuppressWarnings("unused")
	private Operation model;

	public ControlOperation(Interface interf) {
		super();
		this.view = interf;
	}

	public void checkOperation(double a, String ope, double b) {
		try {
			model = OperationFactory.initOperation(ope);
		} catch (CalculatriceException e) {
			e.getDefaultMessage();
		}
	}

	public Interface getInterf() {
		return view;
	}

	public void setInterf(Interface interf) {
		this.view = interf;
	}

}
