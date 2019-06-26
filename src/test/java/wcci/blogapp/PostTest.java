package wcci.blogapp;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Date;

import org.junit.Test;

public class PostTest {
	
	Author author1 = new Author();
	Date date = new Date();
	Tag cool = new Tag();
	Genre music = new Genre();
	
	
	@Test
	public void postShouldHaveAllValues() {
		Post postTest = new  Post(author1, "title1", "body1", date, music, cool);
		long expectedId = postTest.getId();
		Author expectedAuthor = postTest.getAuthor();
		String expectedTitle = postTest.getTitle();
		String expectedBody = postTest.getBody();
		Date expectedDate = postTest.getDate();
		Genre expectedGenre = postTest.getGenre();
		Tag expectedTag = postTest.getTag();
		assertThat(expectedId, is(1L));
		assertThat(expectedAuthor, is(author1));
		assertThat(expectedTitle, is("title1"));
		assertThat(expectedBody, is("body1"));
		assertThat(expectedDate, is(date));
		assertThat(expectedGenre, is(music));
		assertThat(expectedTag, is(cool));
	}

}
