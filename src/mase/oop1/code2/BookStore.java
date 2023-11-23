// Karina Morandi A00315040
package mase.oop1.code2;

public class BookStore {
	
	private class BookImpl implements Book {
		
		private String title;
		private String author;
		private boolean isBestSeller;
		private int howManyLanguages;
		
		private BookImpl(String r, String s, boolean b, int i) {
			title = r;
			author = s;
			isBestSeller = b;
			howManyLanguages = i;
		}

		@Override
		public boolean isBestSeller() {
			return isBestSeller;
		}

		@Override
		public int howManyLanguages() {
			return howManyLanguages;
		}
		
	}

	public Book getABook(String r, String s, boolean b, int i) {
		return new BookImpl(r, s, b, i);
	}

}
