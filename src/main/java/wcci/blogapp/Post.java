package wcci.blogapp;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Post {

	@Id
	@GeneratedValue
	long id;
	
	String title;
	String body;
	Date date;
	
	@ManyToOne
	Author author;
	
	@ManyToOne
	Genre genre;
	
	@ManyToMany
	Tag tag;
	
	public Post(Author author, String title, String body, Date date, Genre genre, Tag tag) {
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

	public Date getDate() {
		return date;
	}

	public Genre getGenre() {
		return genre;
	}

	public Tag getTag() {
		return tag;
	}

}
