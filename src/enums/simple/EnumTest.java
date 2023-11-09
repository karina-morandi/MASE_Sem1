package enums.simple;

public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		switch(day) {
			case MONDAY:
				System.out.println("Mondays are bad");
				break;
			case FRIDAY:
				System.out.println("Fridays are better");
				break;
			case SATURDAY:
				System.out.println("Weekends are best");
				break;
			case SUNDAY:
				System.out.println("Weekends are best");
				break;
			default:
				System.out.println("Midweek days are ok");
				break;
		} //close switch
	}

	public static void main(String[] args) {
		EnumTest m = new EnumTest(Day.MONDAY);
		EnumTest w = new EnumTest(Day.WEDNESDAY);
		EnumTest f = new EnumTest(Day.FRIDAY);
		EnumTest st = new EnumTest(Day.SATURDAY);
		EnumTest sy = new EnumTest(Day.SUNDAY);
		
		m.tellItLikeItIs();
		w.tellItLikeItIs();
		f.tellItLikeItIs();
		st.tellItLikeItIs();
		sy.tellItLikeItIs();		
	}

}
