package controller;

import model.Operation;
import settings.OperationFactory;
import view.Interface;

public class ControlOperation {
	private Interface view;
	private Operation model;
	
	public ControlOperation(Interface interf) {
		super();
		this.view = interf;
	}

	public void checkOperation(double a, String ope, double b) {
		model = OperationFactory.initOperation(ope);
		
		//view.afficherResultat(model.calculer(a,b));
	}
	
	public void doAllInOne(String operationXY) {
		
	}
	
	public Interface getInterf() {
		return view;
	}
	
	public void setInterf(Interface interf) {
		this.view = interf;
	}

}
