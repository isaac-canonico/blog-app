package wcci.blogapp;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	
	@OneToMany (mappedBy = "genre")
	private Collection<Post> posts;
	
	@Id
	long id;

	public Genre() {

	}
	
	
	public Collection<Post> getPosts() {
		return posts;
	}

	public long getId() {
		
		return id;
	}

}
