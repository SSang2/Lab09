package edu.handong.csee.java.lab09;

public class Salesman {		//public class method for salesman
	private String name;		//private instance string variable 
	private double sales;		//private instance double integer variable 

	public Salesman() {		//public method for salesman
		this.name = "";		//referring instance variable
		this.sales = 0.0;	//referring instance variable
	}

	public Salesman(String name, double sales) {
		this.name = name;	//referring instance string variable
		this.sales = sales;		//referring instance integer variable
	}

	public String getName() {		//public accessor for get name
		return this.name;			//type of return value
	}

	public double getSales() {		//public accessor for get sales
		return this.sales;			//type of return value
	}

	public void setName(String name) {		//public mutator for the name
		this.name = name;			//type of return value
	}

	public void setSales(double sales) {	//public mutator for the sales
		this.sales = sales;			//type of return value
	}
}
