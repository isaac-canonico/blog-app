package wcci.blogapp;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Post {

	@Id
	@GeneratedValue
	long id;

	String title;
	
	@Lob
	String body;
	String date;

	@ManyToOne 
	Author author;

	@ManyToOne
	Genre genre;

	@ManyToMany (mappedBy = "posts")
	Collection<Tag> tags = new ArrayList<>();

	public Post(Author author, String title, String body, String date, Genre genre, ArrayList<Tag> tags) {
		this.author = author;
		this.title = title;
		this.body = body;
		this.date = date;
		this.genre = genre;
		this.tags = tags;
	}
	
	public Post() {
		
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

	public Collection<Tag> getTags() {
		return tags;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
