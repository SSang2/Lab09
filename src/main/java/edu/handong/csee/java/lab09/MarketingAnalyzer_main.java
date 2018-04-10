package edu.handong.csee.java.lab09;
/**
 * This lab09 is for MarketingAnalyzer_main
 * by java programming 
 * 
 * @author LeeSangHyun
 */
import java.util.Scanner;		//insert

public class MarketingAnalyzer_main {		//public main class methodA
	//variable declaration
	private double highestSales;		//declare the highest sales variable
	private double averageSales;		//declare the average sales variable
	private static Salesman[] team;		//declare the team (salesman) variable

	public static void main(String[] args) {	//public main method 
		MarketingAnalyzer_main analyzer = new MarketingAnalyzer_main();		//Declaring the constructor
		analyzer.getData();		//Call the method getData
		analyzer.computeAverage();		//Call the method computeAverage
		analyzer.computeHighestSales();		//Call the method HighestSales
		analyzer.printResult();				//Call the method Result
	}
	public void getData() {		//public void method getting Data
		System.out.println("Enter the number of salesmen:");		//print out the instruction
		Scanner myKeyboard = new Scanner(System.in);	//create an object of the Scanner, data enter from the keyboard

		int numofSalesmen = myKeyboard.nextInt();	//read value from the keyboard and assign into number of salesman

		team = new Salesman[numofSalesmen];		 //initialize the array of salesman

		for(int i = 0; i < numofSalesmen; i++) {	//repetitive statement for number of salesman
			System.out.println("Enter data for associate number:" + (i+1));		//print out the instruction
			myKeyboard.nextInt();		//receiving the output integer data
			System.out.println("Name? ");		//print out the instruction
			myKeyboard.nextLine();		//receiving the output string data
			String name = myKeyboard.nextLine();	//read value from the keyboard and assign into name
			System.out.print("Sales? ");		//print out the instruction
			double sales = myKeyboard.nextDouble();	//read double value from the keyboard and assign into sales
			team[i] = new Salesman();		//initialize the team by the salesman
			team[i].setName(name);			//initialize the team by the mutator string value
			team[i].setSales(sales);		//initialize the team by the mutator integer value
		}

	}

	public void computeAverage() {		//public void method for compute the avarage
		double sum = 0;		//initialize the variable its null

		for(int i = 0; i < team.length; i++) {		//repetitive statement for sum
			sum = sum + team[i].getSales();		//calculation of sum
		}

		averageSales = sum/team.length;		//way of making average sales
	}

	public void computeHighestSales() {		//public void method for highest sales

		double highestSales = 0;		//initialize the variables its null
		for(int i= 0; i < team.length; i++) {		//repetitive statement for highest sales
			if(highestSales < team[i].getSales())		//conditional statement for highest sales
				highestSales = team[i].getSales();		//set the value of variables
		}

		this.highestSales = highestSales;		//referring the instance variable
	}

	public void printResult() {		//public void method for result printing

		System.out.println("Average: " + averageSales);		//print in lines for Average
		System.out.println("Salesman who has the highest sales: ");		//print in lines for Highest(Sales) Salesman

		for(int i = 0; i < team.length; i++) {		//repetitive statement for result
			if(team[i].getSales() == highestSales) {	//conditional statement for result
				System.out.println("Name: " + team[i].getName());	//print in lines for name
				System.out.println("Sales: " + team[i].getName());	//print in lines for sales
			}
		}
	}


}