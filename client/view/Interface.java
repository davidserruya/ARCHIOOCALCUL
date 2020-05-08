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
		System.out.print(ApplicationProperties.readProperty("CHOSE_NUMBER_MESSAGE", "Def"));
		a = sc.nextDouble();
		System.out.print(ApplicationProperties.readProperty("CHOSE_OPERATION_MESSAGE", "Def"));
		operation = sc.next();
		System.out.print(ApplicationProperties.readProperty("CHOSE_2ND_NUMBER_MESSAGE", "Def"));
		b = sc.nextDouble();

		this.operation_termes_server = new OperationModel(a, b, operation);

	}

	public void afficherResultat(double result) {
		System.out.println(ApplicationProperties.readProperty("RESULT_MESSAGE", "Def") + result);
	}

	public void afficherError(String errorMessage) {
		System.out.println(errorMessage);
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
