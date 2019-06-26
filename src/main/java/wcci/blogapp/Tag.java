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
	
	public Tag() {

	
	}
	}
	
	
