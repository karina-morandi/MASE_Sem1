package enums.ExamExample;

public enum Farmer {
	//This is a call to the constructor
	DAIRY(200),
	BEEF(150),
	SHEEP(160);
	
	private int numAcres;
	
	//It's private by default, so we don't need to write
	Farmer(int numAcres) {
		this.numAcres = numAcres;
	}

	public int getNumAcres() {
		return numAcres;
	}

	public void setNumAcres(int numAcres) {
		this.numAcres = numAcres;
	}
	
	@Override
    public String toString(){
        final int DAIRY=0, BEEF=1, SHEEP=2;
        String s = "";
        
        switch (this.ordinal()) {
            case DAIRY:
                s = " Dairy farmer ";
                break;
            case BEEF:
                s = " Beef farmer ";
                break;
            case SHEEP:
                s = " Sheep farmer ";
                break;
            default:
                break;
        }
        return s + "and has " + numAcres + " acres.";
    }
}
