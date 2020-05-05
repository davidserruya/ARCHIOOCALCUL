package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OperationModel implements Serializable {

	private double x;
	private double y;
	private String operation;
	private double result;

	public OperationModel(double x, double y, String operation) {
		this.x = x;
		this.y = y;
		this.operation = operation;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
