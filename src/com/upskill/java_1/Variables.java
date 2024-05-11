package com.upskill.java_1;

public class Variables {
	
	public String country ="usa";
	public String region = "north america";
	
//	Variables in Java
//	Instance OR global variable - Variables declared in Class level, outside method
//	Static variable - variables belong to class and don't required creating object
//	Local variable - variables declared in methods 
//	Method parameter - variables used as method parameter


	public static void main(String[] args) {
		
		ny();	
		nj("essex");
		ct();
		
		Variables myObj = new Variables();
		System.out.println(myObj.country);
		
		}
	public static void ny(){
		String city = "Queens";
		System.out.println(city);
		
	}
	public static void nj(String county){
		String city = "Bloomfield";
		System.out.println(city);
		System.out.println(county);
		
	}
	public static void ct(){
		String city = "Hartford";
		System.out.println(city);
		
	}
}
