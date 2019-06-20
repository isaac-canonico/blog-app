package wcci.blogapp;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


import org.junit.Test;

public class PostTest {
	
	Author author1 = new Author();
	
	
	@Test
	public void postShouldHaveAllValues() {
		Post postTest = new  Post(1L, author1, "title1", "body1", "Date1", "genre1", "tag1");
		long expectedId = postTest.getId();
		Author expectedAuthor = postTest.getAuthor();
		String expectedTitle = postTest.getTitle();
		String expectedBody = postTest.getBody();
		String expectedDate = postTest.getDate();
		String expectedGenre = postTest.getGenre();
		String expectedTag = postTest.getTag();
		assertThat(expectedId, is(1L));
		assertThat(expectedAuthor, is(author1));
		assertThat(expectedTitle, is("title1"));
		assertThat(expectedBody, is("body1"));
		assertThat(expectedDate, is("Date1"));
		assertThat(expectedGenre, is("genre1"));
		assertThat(expectedTag, is("tag1"));
	}

}
