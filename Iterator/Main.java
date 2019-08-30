public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf=new BookShelf(4);
		bookShelf.appendBook(new Book("十万个为什么"));
		bookShelf.appendBook(new Book("西游记"));
		bookShelf.appendBook(new Book("红楼梦"));
		Iterator i=bookShelf.iterator();
		while(i.hashNext()){
			Book book=(Book)i.next();
			System.out.println(book.getName());
		}
	}
}