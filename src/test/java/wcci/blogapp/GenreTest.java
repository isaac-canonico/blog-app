package wcci.blogapp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GenreTest {
	
	Genre testGenre = new Genre(1, "sports");
	Genre testGenre1 = new Genre(2, "music");
	
	@Test
	public void genreShouldHaveNameAndId() {
	
		String expectedName = testGenre.getName();
		long expectedId = testGenre.getId();
		assertThat(expectedName, is("sports"));
		assertThat(expectedId, is(1L));
		
	}
	
	@Test
	public void differentGenresShouldHaveDifferentValues() {
		String expectedName = testGenre.getName();
		long expectedId = testGenre.getId();
		assertThat(expectedName, is(not(testGenre1.getName())));
		assertThat(expectedId, is(not(testGenre1.getId())));
	}

}
