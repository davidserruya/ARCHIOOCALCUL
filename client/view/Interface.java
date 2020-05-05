package view;

import java.util.Scanner;

import controller.ControlOperation;
import model.OperationModel;
import settings.ApplicationProperties;

public class Interface {
	private Scanner sc = new Scanner(System.in);
	private ControlOperation controller;
	private OperationModel operation_termes_server;

	public void afficher() {
		double a, b;
		String operation;
		System.out.print(ApplicationProperties.readProperty("CHOSE_NUMBER_MESSAGE", ""));
		a = sc.nextDouble();
		System.out.print(ApplicationProperties.readProperty("CHOSE_OPERATION_MESSAGE", ""));
		operation = sc.next();
		System.out.print(ApplicationProperties.readProperty("CHOSE_2ND_NUMBER_MESSAGE", ""));
		b = sc.nextDouble();

		this.operation_termes_server = new OperationModel(a, b, operation);
	}

	public void afficherResultat(double result) {
		System.out.println( ApplicationProperties.readProperty("RESULT_MESSAGE", "") + result);
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
