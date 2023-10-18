package PastPaper;

final public class NewsPurchase {
	private final Double price;
	private final String location;
	private final NewsMedia media;
	
	private NewsPurchase(final Double price, final String location, final NewsMedia media) {
		this.price = price;
		this.location = location;
		if(media instanceof Broadsheet) {
			this.media = new Broadsheet(media.getName(), media.getEditor());
		} else if(media instanceof Tabloid) {
			this.media = new Tabloid(media.getName(),media.getEditor());
		} else if(media instanceof SubscriptionsService) {
			this.media = new SubscriptionsService(media.getName(), media.getEditor());
		} else if(media instanceof Blog) {
			this.media = new Blog(media.getName(), media.getEditor());
		} else {
			this.media = null;
		}
	} // end of constructor
	
	// factory method to create a NewsPurchase
	public static NewsPurchase createNewInstance(Double price, String location, NewsMedia media) {
		return new NewsPurchase(price, location, media);
	} // create instance of NewsPurchase

	public Double getPrice() {
		return price;
	}

	public String getLocation() {
		return location;
	}

	public NewsMedia getMedia() {
		if(media instanceof Broadsheet){
            return new Broadsheet(media.getName(), media.getEditor());      
        }else if(media instanceof Tabloid){
            return new Tabloid(media.getName(), media.getEditor());      
        }else if(media instanceof SubscriptionsService){
            return new SubscriptionsService(media.getName(), media.getEditor());      
        }else if(media instanceof Blog){
            return new Blog(media.getName(), media.getEditor());      
        }
		
		return null;

	}
	
	@Override
	public String toString() {
		return "\tLocation?:\t\t" + getLocation() +
				"\n\tHow much?:\t\t"+ getPrice() +
				"\n\tDetails are:\n\t\t" +
				getMedia().toString();
	}

}
