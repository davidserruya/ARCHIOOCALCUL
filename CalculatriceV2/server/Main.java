import java.io.IOException;

import controller.ControlOperation;
import exception.CalculatriceException;
import model.OperationModel;
import server.RequeteCalculatrice;
import server.ServiceCalculatrice;
import view.Interface;

public class Main {

	public static void main(String[] args) {
		// VUE
		Interface view = new Interface();

		// controller
		ControlOperation controller = new ControlOperation(view);

		// START SERVER

		new Thread(new Runnable() {
			public void run() {
				try {
					ServiceCalculatrice.lunch();
				} catch (ClassNotFoundException | IOException | CalculatriceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		// START CLIENT

		new Thread(new Runnable() {
			public void run() {
				try {
					view.setControl(controller);
					view.afficher();
					RequeteCalculatrice.call(view.getOperationTermesServer(), view);
				} catch (ClassNotFoundException | IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

	}

}
