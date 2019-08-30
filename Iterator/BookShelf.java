public class BookShelf implements MyCollection {
	private Book[] books;
	private int index = 0;//这是其实就是size,应该写size的
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	public Book getBookAt(int index) {
		return books[index];//此index非彼index
	}
	public void appendBook(Book book) {
		this.books[index] = book;
		index++;
	}
	public int getLength() {
		return index;
	}
	public BookShelfIterator iterator() {
		return new BookShelfIterator(this);
	}
}