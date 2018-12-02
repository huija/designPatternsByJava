public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf=bookShelf;
		this.index=0;
	}
	public boolean hashNext() {
		if(index<bookShelf.getLength()){
			return true;
		}
		return false;
	}
	
	public Book next() {
		Book book=bookShelf.getBookAt(index);
		index++;
		return book;
	}
	
}