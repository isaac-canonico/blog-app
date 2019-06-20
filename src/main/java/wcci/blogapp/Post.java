package wcci.blogapp;

public class Post {

	long id;
	Author author;
	String title;
	String body;
	String date;
	String genre;
	String tag;
	
	public Post(long id, Author author, String title, String body, String date, String genre, String tag) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.body = body;
		this.date = date;
		this.genre = genre;
		this.tag = tag;
	}

	public long getId() {
		return id;
	}

	public Author getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public String getDate() {
		return date;
	}

	public String getGenre() {
		return genre;
	}

	public String getTag() {
		return tag;
	}

}
