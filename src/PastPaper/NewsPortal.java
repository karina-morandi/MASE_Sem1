package PastPaper;

import java.util.ArrayList;

public class NewsPortal {
	
	public static void main(String [] args) {
		ArrayList<NewsPurchase> newsPurchases = new ArrayList<>();
		
		NewsPurchase theIrishDailyStar = NewsPurchase.createNewInstance(2.90, "Athlone Newsagents", new Tabloid("The Irish Daily Star", "Des Gibson"));
		newsPurchases.add(theIrishDailyStar);
		
		NewsPurchase subscrService = NewsPurchase.createNewInstance(0.0, "http://www.huffingtonpost.co.uk/", new SubscriptionsService("The Huffington Post", "Tara Lee"));
		newsPurchases.add(subscrService);
		
		processNewsPurchases(newsPurchases);
	
	}
	
	public static void processNewsPurchases(ArrayList<NewsPurchase> newsPurchases) {
		
		for(NewsPurchase newsPurchase: newsPurchases) {
			System.out.println(newsPurchase);
			if(newsPurchase.getMedia() instanceof QualityJournalism) {
				System.out.print(" - Quality Journalism Item");
			}
			System.out.println();
		}
	}

}
