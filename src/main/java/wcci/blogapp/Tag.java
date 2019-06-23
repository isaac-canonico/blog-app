package wcci.blogapp;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	String name;
	
	@GeneratedValue
	long id;
	
	@ManyToMany (mappedBy = "tag")
	private Collection<Post> tags;
	
	public Tag (long id, String name) {
		this.id = id;
		this.name = name;
	
	}
	}
	
	
