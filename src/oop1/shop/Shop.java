package oop1.shop;

import java.util.ArrayList;

public class Shop {

	public static void main(String[] args) {
		ArrayList <ElectronicDevice> devices = new ArrayList<>();
		
		ElectronicDevice sonyPlasmaTv = new Plasma("Sony", "P300");
		devices.add(sonyPlasmaTv);
		
		ElectronicDevice dellInspiration = new Laptop("Dell", "Inspiration");
		devices.add(dellInspiration);
		
		processDevices(devices);		

	}
	
	public static void processDevices(ArrayList<ElectronicDevice> devices) {
		// enhanced for loop
		
		for(ElectronicDevice device : devices) {
			System.out.print(device);
			if (device instanceof HighlyDesirable) {
				System.out.println(" - Highly Desirable Item");
			}
			System.out.println(); //Blank line
		}
	}

}
