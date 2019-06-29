package wcci.blogapp;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity

public class Author {
	
	@GeneratedValue
	@Id
	long id;
	
	String name;
	Collection<Post> posts;
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Post> getPosts() {
		return posts;
	}
	
	public Author() {
		
	}

	public Author(String name) {
		
	}
	
	
	

}
