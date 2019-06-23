package wcci.blogapp;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	
	private String name;
	@OneToMany (mappedBy = "genre")
	private Collection<Post> posts;
	
	@Id
	long id;

	public Genre(long id, String name) {
		this.id = id;
		this.name = name;

	}
	
	public String getName() {
		return name;
	}
	
	public Collection<Post> getPosts() {
		return posts;
	}

	public long getId() {
		
		return id;
	}

}
