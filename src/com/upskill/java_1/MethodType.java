package com.upskill.java_1;

public class MethodType {

	/* 	Types of Methods
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */
	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		MethodType  Obj= new MethodType();
		Obj.annualIncomeVoid();
		System.out.println("My monthlyIncomeReturn = " +Obj.monthlyIncomeReturn());
		System.out.println(Obj.States());
		weeklyIncome();
		System.out.println("He is rich = " +richOrNot());
	}
	public void annualIncomeVoid(){
		int calculateIncome = hourlyIncome * 2000;		
		System.out.println("My annual income = "+ calculateIncome );
	}
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome= hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	public String States(){
		String State= "New York";
		return State;
		
	}
	public static void weeklyIncome(){
		int calculateWeekly = hourlyIncome * 40;
		System.out.println("My weekly Income " + calculateWeekly);
	}
	public static boolean richOrNot(){
		boolean rich = true;
		return rich;
	}
}
