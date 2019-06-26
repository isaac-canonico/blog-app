package wcci.blogapp;

import java.util.Collection;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class Author {
	
	@GeneratedValue
	@Id
	long id;
	
	String name;
	Collection<Post> posts;

}
