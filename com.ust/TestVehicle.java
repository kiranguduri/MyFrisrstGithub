package com.ust;

import java.util.ArrayList;
import java.util.Collections;

public class TestVehicle {

	public static void main(String[] args) {
		Engine carEngine = new RegularEngine(1000);
		Car car = new Car(20, carEngine);
		Car car1 = new Car(10, carEngine);
		Car car2 = new Car(30, carEngine);
		//car.start();
		
		
		Engine planeEngine = new SuperEngine(10000, 2345);
		Plane plane = new Plane(4000, 90000, planeEngine);
		Plane plane1 = new Plane(1000, 30000, planeEngine);
		Plane plane2 = new Plane(2000, 50000, planeEngine);
		//plane.start();
		
		ArrayList<Vehicle> av=new ArrayList<Vehicle>();
		av.add(car);
		av.add(car1);
		av.add(car2);
		av.add(plane);
		av.add(plane1);
		av.add(plane2);
		int max=0;
		
		for(Vehicle e: av) {
			if(max<e.speed)
			{
				max=e.speed;
				System.out.println("Max speed"+max);
			}
			e.start();
		}
		
		
		Collections.sort(av);
		
		for(Vehicle e: av) {
			e.start();
		}
		

	}

}
