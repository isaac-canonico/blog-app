package wcci.blogapp;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class PostControllerTest {

	@InjectMocks
	PostController underTest;

	@Mock
	PostRepository mockRepo;

	@Mock
	Model mockModel;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getAllBooksReturnsAllBooks() {
		Author ben = new Author();
		Date date = new Date();
		Genre java = new Genre();
		Tag coding = new Tag();
		Post testPost = new Post(ben, "title1", "blah blah blah", "date", java, coding);
		List<Post> testPosts = Collections.singletonList(testPost);
		Mockito.when(mockRepo.findAll()).thenReturn(testPosts);
		underTest.getPosts(mockModel);
		Mockito.verify(mockModel).addAttribute("posts", testPosts);
	}

}
