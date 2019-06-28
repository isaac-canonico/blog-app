package wcci.blogapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Post {

	LocalDateTime now = LocalDateTime.now();

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	@Id
	@GeneratedValue
	long id;

	String title;
	String body;
	String date = now.format(formatter);

	@ManyToOne
	Author author;

	@ManyToOne
	Genre genre;

	@ManyToMany
	Tag tag;

	public Post(Author author, String title, String body, String date, Genre genre, Tag tag) {
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

	public Genre getGenre() {
		return genre;
	}

	public Tag getTag() {
		return tag;
	}

}
