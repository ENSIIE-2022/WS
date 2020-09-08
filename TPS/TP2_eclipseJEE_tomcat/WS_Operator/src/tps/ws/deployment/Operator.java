package tps.ws.deployment;

public class Operator {

	public String addition(int value1, int value2){
		value1=value1+value2;
		return "le resultat vaut "+value1;
	}
	
	public String soustraction(int value1, int value2){
		value1=value1-value2;
		return "le resultat vaut "+value1;
	}
	
	public String multiplication(int value1, int value2){
		value1=value1*value2;
		return "le resultat vaut "+value1;
	}
	
	public String division(int value1, int value2){
		value1=value1/value2;
		return "le resultat vaut "+value1;
	}
}
