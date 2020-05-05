package view;

import java.util.Scanner;

import controller.ControlOperation;
import model.OperationModel;

public class Interface {
	private Scanner sc = new Scanner(System.in);
	private ControlOperation controller;
	private OperationModel operation_termes_server;

	public void afficher() {
		double a, b;
		String operation;
		System.out.print("Veuillez saisir un nombre : ");
		a = sc.nextDouble();
		System.out.print("operation : ");
		operation = sc.next();
		System.out.print("Veuillez saisir un autre nombre : ");
		b = sc.nextDouble();

		this.operation_termes_server = new OperationModel(a, b, operation);
	}

	public void afficherResultat(double result) {
		System.out.println("\n le résultat est : " + result);
	}

	public ControlOperation getControl() {
		return controller;
	}

	public void setControl(ControlOperation control) {
		this.controller = control;
	}

	public OperationModel getOperationTermesServer() {
		return operation_termes_server;
	}

}
