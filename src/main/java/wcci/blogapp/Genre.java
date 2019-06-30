package wcci.blogapp;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	
	@OneToMany (mappedBy = "genre")
	private Collection<Post> posts;
	
	@GeneratedValue
	@Id
	long id;
	
	String name;

	public Genre() {

	}
	
	public Genre(String name) {
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
		Genre other = (Genre) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
