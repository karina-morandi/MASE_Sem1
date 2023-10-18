package PastPaper;

public abstract class Print implements NewsMedia {  // Italic means abstract class, + public
	private String theName; // - private
	
	public Print(String aName) {
		theName = aName;
	}
	
	@Override
	public String getName() {
		return theName;
	}
	
	@Override
	public String toString() {
		return "Name is\t" + getName();
	}
}

class Broadsheet extends Print implements QualityJournalism{  //~Broadsheet means it's not public nor private
	private String theEditor;
	
	Broadsheet(String aName, String aEditor){
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

class Tabloid extends Print {
	private String theEditor;
	
	Tabloid(String aName, String aEditor) {
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
