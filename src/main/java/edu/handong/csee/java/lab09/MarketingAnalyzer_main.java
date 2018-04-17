package edu.handong.csee.java.lab09;
/**
 * This lab09 is for MarketingAnalyzer_main
 * by java programming 
 * 
 * @author LeeSangHyun
 */
import java.util.Scanner;		//insert
import java.util.ArrayList;
public class MarketingAnalyzer_main {		//public main class methodA
	//variable declaration
	private double highestSales;		//declare the highest sales variables
	private double averageSales;		//declare the average sales variables
	ArrayList <Salesman> team = new ArrayList<Salesman>();	//declare the new ArrayList for Salesman
	//private static Salesman[] team;		//declare the team (salesman) variable

	public static void main(String[] args) {	//public main method 
		MarketingAnalyzer_main analyzer = new MarketingAnalyzer_main();	//Declaring the constructor for new Array List
		analyzer.getData();		//Call the method getData
		analyzer.computeAverage();		//Call the method computeAverage
		analyzer.computeHighestSales();		//Call the method HighestSales
		analyzer.printResult();				//Call the method Result
	}
	public void getData() {		//public void method getting

		Scanner myKeyboard = new Scanner(System.in);	//create an object of the Scanner, data enter from the keyboard

		int i=0;					//declare the integer i variable and save 0;
		boolean done = false;		//use boolean expression to make two ways for do it or not
		while(done != false) {		// if its done = true

			Salesman data = new Salesman();	//declare the new operator Salesman for Salesman data

			System.out.println("Enter data for associate number:" + (i+1));	//print out the instruction
			i++;	//increase the value of i one by one for the process

			System.out.println("Name? ");		//print out the instruction
			String name = myKeyboard.nextLine();	//get the name from the keyboard
			data.setName(name);			//read value from the keyboard and assign into name
			System.out.print("Sales? ");		//print out the instruction
			double sales = myKeyboard.nextDouble();	//read double value from the keyboard and assign into sales
			data.setSales(sales);		//read value from the keyboard and assign into sales
			team.add(data);		//add the specified elements of ArrayList team for data and initial capacity
			System.out.println("More items for the list? :");	//print out the line for the additional information for item lists
			myKeyboard.nextLine();		//get the input value from the keyboard in next line
			String ans = myKeyboard.nextLine();	//get the input value of string character from the keyboard in next line
			if(!ans.equalsIgnoreCase("yes"))	//if the answer is yes
				done = true;		//symmetric of done is true, then it gets the continuing process

		}
	}

	public void computeAverage() {		//public void method for compute the average
		double sum = 0;		//initialize the variable its null

		for(int i = 0; i < team.size(); i++) {		//repetitive statement for sum
			sum = sum + team.get(i).getSales();		//calculation of sum
		}

		averageSales = sum/team.size();		//way of making average sales
	}

	public void computeHighestSales() {		//public void method for highest sales

		double highestSales = 0;		//initialize the variables its null
		for(int i= 0; i < team.size(); i++) {		//repetitive statement for highest sales
			if(highestSales < team.get(i).getSales())		//conditional statement for highest sales
				highestSales = team.get(i).getSales();		//set the value of variables
		}

		this.highestSales = highestSales;		//referring the instance variable
	}

	public void printResult() {		//public void method for result printing

		System.out.println("Average: " + averageSales);		//print in lines for Average
		System.out.println("Salesman who has the highest sales: ");		//print in lines for Highest(Sales) Salesman

		for(int i = 0; i < team.size(); i++) {		//repetitive statement for result
			if(team.get(i).getSales() == highestSales) {	//conditional statement for result
				System.out.println("Name: " + team.get(i).getName());	//print in lines for name
				System.out.println("Sales: " + team.get(i).getName());	//print in lines for sales
			}
		}
	}


}