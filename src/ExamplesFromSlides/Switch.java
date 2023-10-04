package ExamplesFromSlides;

public class Switch {
	
	
	public static void main(String[] args) { 
			int dayOfWeek = 5;
			String day = "";	
			
			switch (dayOfWeek){
			    case 2:
			    case 3:
			    case 4:
			    case 5:
			    case 6:
			        day = "weekday";
			        break;
			    case 1:
			    case 7:
			        day = "weekend";
			        break;
			}
			System.out.println("Today is a " + day);

		
		
	}
}