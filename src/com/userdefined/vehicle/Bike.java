package com.userdefined.vehicle;//creating user-defined package

public class Bike {//user-defined class
	
	String ownername; //declare an variables
	String company;
	int  model;
	String fuel;
	int registration; 
	
  public Bike(String ownername,String company,int  model,String fuel,int registration )//constructor
	{
		this. ownername=ownername;//assign constructor parameters to class variables 
		this. company=company;
		this. model=model;
		this. fuel=fuel;
		this. registration=registration; 
	}
	
	public void details()//method
	{
		System.out.println("Bike owner:"+" "+ownername);//print statements
		System.out.println("Bike Company:"+" "+company);
		System.out.println("Bike model:"+" "+model);
		System.out.println("Bike fuel:"+" "+fuel);
		System.out.println("Bike registration:"+" "+registration);
	}
	

}//class ends

//Note: in all classes,methods & constructors are using public access specifier for accessing out side of the package
