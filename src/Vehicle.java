//import com.userdefined.vehicle.Bike;
//import com.userdefined.vehicle.Car;

import com.userdefined.vehicle.*;//import user-defined package

public class Vehicle {//main class

	public static void main(String[] args) {//main method of the class-prototype method
	
		Car c=new Car("ganesh","jaguar",2020,"diesel",2021);//creating an object instance for accessing method and constructor body 
		Bike b=new Bike("kumar","hero",2021,"petrol",2021);//creating an object instance for accessing method and constructor body 
		c.details();//calling method in car class
		b.details();//calling method in bike class

	}

}
