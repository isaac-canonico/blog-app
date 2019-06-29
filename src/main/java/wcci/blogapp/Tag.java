package wcci.blogapp;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@GeneratedValue
	long id;
	
	@ManyToMany (mappedBy = "tag")
	private Collection<Post> posts;
	
	String name;
	
	public long getId() {
		return id;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	public String getName() {
		return name;
	}

	public Tag() {

	
	}
	
	public Tag(String name) {
		
	}
	}
	
	
