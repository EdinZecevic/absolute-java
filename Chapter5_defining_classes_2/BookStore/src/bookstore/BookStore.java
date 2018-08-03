package bookstore;

public class BookStore {
	
	private String bookCategory;
	private String kids="Kids";
	private String enginiering="Enginiering";
	private String stroy="Stroy";
	private String author;
	private String title;
	private String publisher;
	private double price;
	private int quantity;
	
	@SuppressWarnings("unused")
	private static int count=0;
	
	
	
	public BookStore() {
		bookCategory="no category";
		author="no author";
		title="no title";
		publisher="no publisher";
		price=0;
		quantity=0;
	}
	public BookStore(String bookCategory) {
		setBookCategory(bookCategory);
		author="no author";
		title="no title";
		publisher="no publisher";
		price=0;
		quantity=0;
		count++;
	}
	public BookStore(String bookCategory,String author) {
		setBookCategory(bookCategory);
		setAuthor(author);
		title="no title";
		publisher="no publisher";
		price=0;
		quantity=0;
		count++;
	}
	public BookStore(String bookCategory,String author,String title) {
		setBookCategory(bookCategory);
		setAuthor(author);
		setTitle(title);
		publisher="no publisher";
		price=0;
		quantity=0;
		count++;
	}
	public BookStore(String bookCategory,String author,String title,String publisher) {
		setBookCategory(bookCategory);
		setAuthor(author);
		setTitle(title);
		setPublisher(publisher);
		price=0;
		quantity=0;
		count++;
	}
	public BookStore(String bookCategory,String author,String title,String publisher,double price) {
		setBookCategory(bookCategory);
		setAuthor(author);
		setTitle(title);
		setPublisher(publisher);
		setPrice(price);
		quantity=0;
		count++;
	}
	public BookStore(String bookCategory,String author,String title,String publisher,double price,int quantity) {
		setBookCategory(bookCategory);
		setAuthor(author);
		setTitle(title);
		setPublisher(publisher);
		setPrice(price);
		setQuantity(quantity);
		count++;
	}
	
	
	public void setBookCategory(String bookCategory) {
		if(bookCategory.equals(this.kids))
			this.bookCategory=this.kids;
		else if(bookCategory.equals(this.enginiering))
			this.bookCategory=this.enginiering;
		else if(bookCategory.equals(this.stroy))
			this.bookCategory=this.stroy;
		else
			System.out.println("eror");
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public String toString() {
		return(bookCategory+", "+author+", "+title+", "+publisher+", "+price+", "+quantity);
	}

	public static int numberOfSoldBooks() {
		return count;
	}

}
