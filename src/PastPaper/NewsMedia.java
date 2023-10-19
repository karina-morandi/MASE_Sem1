package PastPaper;

public interface NewsMedia {  //+NewsMedia (public)
	public String getName();
	public String getEditor();

}

interface QualityJournalism{  //~QualityJournalism (not public)
	
}



//UML Diagram
// + public
// - private
// ~ no word
// Italic abstract
// Underline static
// -----> interface (implements)
// -> inheritance (extends)
// -<> composition aggregation: a child cannot exist without its parent class. Parent goes on the side of the diamond, child on the other side