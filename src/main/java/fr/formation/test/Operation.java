package fr.formation.test;

import fr.formation.test.exception.OperationException;

public class Operation {

	public double addition(double a, double b) {
		return a + b;
	}

	public int addition(int a, int b) {
		return a + b;
	}

	public double soustraction(double a, double b) {
		return a - b;
	}

	
	public double division(double a, double b) {
		if (b == 0)
			throw new OperationException("Division par zero");
		
		return a / b;
	}
}
