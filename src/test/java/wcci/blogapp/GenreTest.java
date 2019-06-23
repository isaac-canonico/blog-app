package wcci.blogapp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GenreTest {
	
	@Test
	public void GenreShouldHaveNameAndId() {
		Genre testGenre = new Genre(1, "sports");
		String expectedName = testGenre.getName();
		long expectedId = testGenre.getId();
		assertThat(expectedName, is("sports"));
		assertThat(expectedId, is(1L));
		
		
		
	}

}
