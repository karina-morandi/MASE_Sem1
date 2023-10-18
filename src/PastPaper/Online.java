package PastPaper;

public abstract class Online implements NewsMedia {
	private String theName;
	
	public Online(String aName){
		theName = aName;
	}

	public String getName() {
		return theName;
	}
	
	@Override
	public String toString() {
		return "ONLINE Name\t" + getName();
 	}

}

class Blog extends Online{
	private String theEditor;
	
	Blog(String aName, String aEditor) {
		super(aName);
		theEditor = aEditor;
	}
	
	@Override
	public String getEditor() {
		return theEditor;
	}
	
	@Override
	public String toString() {
		return super.toString() + " whose editor is " + getEditor();
	}
}

class SubscriptionsService extends Online implements QualityJournalism {
	private String theEditor;
	
	SubscriptionsService(String aName, String aEditor) {
		super(aName);
		theEditor = aEditor;
	}
	
	@Override
	public String getEditor() {
		return theEditor;
	}
	
	@Override
	public String toString() {
		return super.toString() + " whose editor is " + getEditor();
	}
}
