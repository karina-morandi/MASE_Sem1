package mase.oop1.code1;

import java.util.ArrayList;

public class Monaco {
	
	public static void main(String [] args) {
		ArrayList<String> items = new ArrayList<>();
		
		items.add("Rolex");
		items.add("Cartier");
		
		ArrayList<Billionaire> people = new ArrayList<>();
		LeisureCart hammadShop = LeisureCart.createNewInstance("Monaco", items, new Yacht(2.5E8));
		
		Billionaire hammad = new Billionaire("Sheikh Hammad", hammadShop);
		
		people.add(hammad);
		
		items.clear();
		
		items.add("Gucci");
		items.add("Versace");
		
		LeisureCart mcmanusShop = LeisureCart.createNewInstance("Ireland", items, new Saloon(80000));
		
		Billionaire mcmanus = new Billionaire("JP McManus", mcmanusShop);
		
		people.add(mcmanus);
		
		processBillionaires(people);
			
	} // end main
	
	public static void processBillionaires(ArrayList<Billionaire> people) {
		for(Billionaire b : people) {
			System.out.println(b);
			if(b.getThePurchase().getMachine() instanceof Desirable) {
				System.out.println(" - Desirable Item");
			} else if(b.getThePurchase().getMachine() instanceof Car) {
//				if(Car.isPractical() == true) {
//					System.out.println(" - Practical Car");
				}
			}
	}

}

class Billionaire {
	private String name;
	private LeisureCart thePurchase;
	
	Billionaire(String n, LeisureCart p) {
		name = n;
		thePurchase = p;
	}

	public LeisureCart getThePurchase() {
		return thePurchase;
	}
	
	@Override
	public String toString() {
		return name + " purchased " + "\nDetails: " + getThePurchase().toString();
	}
}
