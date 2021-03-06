package creational.factory_method;

import common.Vehicle;
import common.Vehicle.Colour;
import creational.factory_method.VehicleFactory.DrivingStyle;

public class FactoryMethodClient {
	public static void main(String[] args) {
		VehicleFactory factory = new CarFactory();
		Vehicle car = factory.build(DrivingStyle.ECONOMICAL, Colour.BLACK);
		
		System.out.println(car);
		
		factory = new VanFactory();
		Vehicle van = factory.build(DrivingStyle.POWERFUL, Colour.RED);
		System.out.println(van);
	}
}
