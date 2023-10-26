package mase.oop1.code1;

import java.util.ArrayList;

final public class LeisureCart {
	private final String location;
	private final ArrayList<String> items;
	private final Machine machine;

	private LeisureCart(final String location, final ArrayList<String> items, final Machine machine) {
		this.location = location;
		this.items = new ArrayList<String>(items);
		if(machine instanceof Yacht) {
			this.machine = new Yacht(machine.getPrice());
		} else if (machine instanceof Canoe) {
			this.machine = new Canoe(machine.getPrice());
		} else if(machine instanceof Kayak) {
			this.machine = new Kayak(machine.getPrice());
		} else if(machine instanceof Saloon) {
			this.machine = new Saloon(machine.getPrice());
		} else if(machine instanceof Hatchback) {
			this.machine = new Hatchback(machine.getPrice());
		} else if(machine instanceof Convertible) {
			this.machine = new Convertible(machine.getPrice());
		} else {
			this.machine = null;
		} //close else if
	}// end constructor
	
	public static LeisureCart createNewInstance(String location, ArrayList<String> items, Machine machine) {
		return new LeisureCart(location, items, machine);
	}

	public String getLocation() {
		return location;
	}

	public ArrayList<String> getItems() {
		return new ArrayList<String>(items);
	}

	public Machine getMachine() {
		if(machine instanceof Yacht) {
			return new Yacht(machine.getPrice());
		} else if (machine instanceof Canoe) {
			return new Canoe(machine.getPrice());
		} else if(machine instanceof Kayak) {
			return new Kayak(machine.getPrice());
		} else if(machine instanceof Saloon) {
			return new Saloon(machine.getPrice());
		} else if(machine instanceof Hatchback) {
			return new Hatchback(machine.getPrice());
		} else if(machine instanceof Convertible) {
			return new Convertible(machine.getPrice());
		}
		return null;
	}
	
	
	@Override
	public String toString() {
		return "\tWhere?:\t\t" + getLocation() +
				"\n\tHow much?:\t" + getMachine().toString() +
				"\n\tItems?:\t\t" + items + 
				"\n\tDetails:\t\t";
	}
	
	
}
