// Karina Morandi A00315040
package mase.oop1.code2;

public enum Lecturer {
	AL(18),
	L(16),
	SL(10);
	
	private int contractHoursPerWeek;
	private int yearsService;
	private boolean hasMasters;
	private boolean hasPhd;
	
	Lecturer(int contractHoursPerWeek) {
		this.contractHoursPerWeek = contractHoursPerWeek;
	}

	public int getYearsService() {
		return yearsService;
	}

	public void setYearsService(int yearsService) {
		this.yearsService = yearsService;
	}

	public boolean hasMasters() {
		return hasMasters;
	}

	public void setMasters(boolean hasMasters) {
		this.hasMasters = hasMasters;
	}

	public boolean hasPhd() {
		return hasPhd;
	}

	public void setPhd(boolean hasPhd) {
		this.hasPhd = hasPhd;
	}

	public int getContractHoursPerWeek() {
		return contractHoursPerWeek;
	}
	
	@Override
	public String toString() {
		final int AL = 0, L = 1, SL = 2;
		
		String s = "";
		
		switch(this.ordinal()) {
			case AL:
				s = "Assistant Lecturer: ";
				break;
			case L:
				s = "Lecturer: ";
				break;
			case SL:
				s = "Senior Lecturer: ";
				break;
			default:
				break;
		}
		
		return s + "\n\tHas a Masters: " + hasMasters + "\n\tHas Phd: " + hasPhd + "\n\t" + contractHoursPerWeek + " contract hours/week, " + yearsService + " years of service.";
	}
	
}
