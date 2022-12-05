package com.talentodigital.calculator;

public class Calculator implements java.io.Serializable {
	
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public Calculator() { // constructor vac�o.
	}
	
	//getter
	
	public  double getOperandOne() {
		return operandOne;
	}
	
	public  double getOperandTwo() {
		return operandTwo;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public void getResult() {
		System.out.println("el resultado de la operaci�n es : " + this.result);
	}
	
	// setter 
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	// m�todo que setea la operaci�n y valida que se ingresen los operadores correctos de suma o resta.
	
	public void setOperation(String operation) {
		if (operation == "+" || operation == "-") {
			this.operation = operation;
		}
		else {
			System.out.println("Operador incorrecto");
		}
	}
	
	// Operaci�n
	
	public void performOperation() {
		if(getOperation() == "+") {
			this.result = getOperandOne()+getOperandTwo();
		} else if(getOperation() == "-") {
			this.result = getOperandOne()-getOperandTwo();
		} else {
			System.err.println("operaci�n inv�lida");
		}
	}
	
}

